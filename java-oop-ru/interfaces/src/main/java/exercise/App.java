package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
import java.util.Comparator;
public class App {
    public  static List<String> buildApartmentsList(List<Home> apartments, int n){
        return apartments.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .map(Home::toString)
                .limit(n)
                .collect(Collectors.toList());
    }
}

// END
