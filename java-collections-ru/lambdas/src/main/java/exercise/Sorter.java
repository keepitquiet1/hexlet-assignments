package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
public static List takeOldestMans(List<Map<String, String>> users) {
        List maleList = users.stream().filter(user -> user.get("gender").equals("male")).map(user -> user.get("name")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        int a = 1;
        for (Object birthday : maleList){
            System.out.println(a + " = " + birthday);
            a+=1;
        }
        System.out.println(maleList);
        return maleList;
    }
}

// END
