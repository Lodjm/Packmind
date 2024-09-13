package practices.java.use_local_immutable;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNamesHelper {

    public static Map<String, Long> countNames(List<String> names) {
        return names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
