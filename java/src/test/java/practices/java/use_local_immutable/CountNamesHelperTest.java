package practices.java.use_local_immutable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static practices.java.use_local_immutable.CountNamesHelper.countNames;

class CountNamesHelperTest {

    static Stream<Arguments> count() {
        return Stream.of(
                whenCountNames()
                        .withNoNames()
                        .thenExpectEmpty(),
                whenCountNames()
                        .withNames("toto", "toto", "tata")
                        .thenExpect("toto", 2L, "tata", 1L)
        );
    }

    @ParameterizedTest
    @MethodSource
    void count(CountTestParams countTestParams) {
        Map<String, Long> actual = countNames(countTestParams.names);

        assertThat(actual).containsExactlyInAnyOrderEntriesOf(countTestParams.expected);
    }

    static CountTestParams whenCountNames() {
        return new CountTestParams();
    }

    static class CountTestParams {
        List<String> names = new ArrayList<>();
        Map<String, Long> expected = new HashMap<>();

        CountTestParams withNoNames() {
            this.names.clear();
            return this;
        }

        CountTestParams withNames(String... names) {
            this.names.addAll(Arrays.asList(names));
            return this;
        }

        Arguments thenExpectEmpty() {
            this.expected.clear();
            return Arguments.of(this);
        }

        Arguments thenExpect(String name1, long value1, String name2, long value2) {
            this.expected.putAll(Map.of(name1, value1, name2, value2));
            return Arguments.of(this);
        }
    }
}