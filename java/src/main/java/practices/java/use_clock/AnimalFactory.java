package practices.java.use_clock;

import java.time.Clock;
import java.time.Instant;

public class AnimalFactory {
    private final Clock clock;

    public AnimalFactory(Clock clock) {
        this.clock = clock;
    }

    public Animal createAnimalNamed(String name) {
        Instant birthday = clock.instant();
        return new Animal(name, birthday);
    }
}
