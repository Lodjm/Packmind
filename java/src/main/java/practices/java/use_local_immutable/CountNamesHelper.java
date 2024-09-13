package practices.java.use_local_immutable;

import java.util.List;
import java.util.Map;

public class CountNamesHelper {

    public static Map<String, Long> countNames(List<String> names, Map<String, Long> countByName) {
        for (String name : names) {
            long previousCount = countByName.getOrDefault(name, 0L);
            countByName.put(name, previousCount + 1);
        }
        return countByName;
    }
}
