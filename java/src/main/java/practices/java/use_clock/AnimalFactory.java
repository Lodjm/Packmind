package practices.java.use_clock;

import java.time.Instant;

public class AnimalFactory {

    public Animal createAnimalNamed(String name) {
        Instant birthday = Instant.now();
        return new Animal(name, birthday);
    }
}
