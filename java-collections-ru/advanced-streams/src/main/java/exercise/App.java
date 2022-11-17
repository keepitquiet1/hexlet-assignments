 package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String confFile) {

            List<String> resultList = Arrays.stream(confFile.split("\n"))
                    .filter(str -> str.startsWith("environment"))
                    .map(obj -> obj.replace("environment=", ""))
                    .map(s -> s.replace("X_FORWARDED_", ""))
                    .map(c -> c.replace(",", ""))
                    .map(l -> l.replace(" ", ""))
                    .collect(Collectors.toList());
            System.out.println(resultList);
            return resultList.toString();
        }
    }

//END
