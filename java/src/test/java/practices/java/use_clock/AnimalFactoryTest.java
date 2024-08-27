package practices.java.use_clock;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalFactoryTest {
    AnimalFactory animalFactory = new AnimalFactory(Clock.fixed(
            Instant.parse("2024-07-14T12:34:00.00Z"), ZoneId.of("UTC")));

    @Test
    void init_birthday() {
        Animal actual = animalFactory.createAnimalNamed("toto");
        assertThat(actual.birthday()).isEqualTo("2024-07-14T12:34:00.00Z");
    }
}