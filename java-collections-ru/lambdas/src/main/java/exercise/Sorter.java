package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
public static List takeOldestMans(List<Map<String, String>> users) {
        List maleList = users.stream().filter(user -> user.get("gender").equals("male")).sorted(Comparator.comparing(e-> e.get("birthday"))).map(user -> user.get("name")).collect(Collectors.toList());
        return maleList;
    }
}

// END
