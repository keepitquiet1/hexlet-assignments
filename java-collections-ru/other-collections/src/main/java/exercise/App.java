package exercise;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
public static LinkedHashMap genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        List keys = new ArrayList<>();
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
            for (String d1 : data1.keySet()) {
                if (!(keys.contains(d1))) {
                    keys.add(d1);
                }
            } for (String d2 : data2.keySet()) {
            if (!(keys.contains(d2))) {
                keys.add(d2);
            }
        } System.out.println(keys);
            for (Object key : keys) {
                String keyString = key.toString();
                if (!(data1.containsKey(keyString))
                        & (data2.containsKey(keyString))) {
                    result.put(keyString, "added");
                }
                if ((data1.containsKey(keyString))
                        & (!(data2.containsKey(keyString)))) {
                    result.put(keyString, "deleted");
                } else if ((data1.containsKey(keyString))
                        & ((data2.containsKey(keyString)))) {
                    for (Map.Entry<String, Object> keyChanged1 : data1.entrySet()) {
                        for (Map.Entry<String, Object> keyChanged2 : data2.entrySet()) {
                            if (!(keyChanged1.getValue().toString().equals(keyChanged2.getValue().toString()))) {
                                result.put(keyString, "changed");
                            } else {
                                result.put(keyString, "unchanged");
                            }
                        }
                    }
                }
            }System.out.println(result);
        return result;
        }
}

//END
