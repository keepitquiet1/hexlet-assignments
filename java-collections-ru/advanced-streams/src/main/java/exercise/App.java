package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.*;
// BEGIN
public class App {
    public static String getForwardedVariables(String confFile) {
        List<String> resultList = Arrays.stream(confFile.split("\n"))
            .filter(str -> str.startsWith("environment"))
            .map(obj -> obj.replace("environment=", ""))
            .map(d -> d.replace("\"", ""))
            .map(l -> l.replace(" ", ""))
            .collect(Collectors.toList());
        var resultListToString = resultList.toString();
        List<String> resList = Arrays.stream(resultListToString
            .split(","))
            .filter(s -> s.contains("X_FORWARDED_"))
            .map(s -> s.replace("X_FORWARDED_", ""))
            .collect(Collectors.toList());
        var l = resList.toString().replace("[", "").replace("]", "");
        return l;
    }
}

//END
