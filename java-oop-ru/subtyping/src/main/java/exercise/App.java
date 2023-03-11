package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> stringStringMap = storage.toMap();
        for (String key : stringStringMap.keySet()){
            storage.unset(key);
            storage.set(stringStringMap.get(key), key);
        }
    }
}

// END
