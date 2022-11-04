package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
public static List findWhere(List<Map<String, String>> books, Map checkMap) {
        List<String> newBook = new ArrayList<>();
            for (int i = 0; i < books.size(); i++) {
                for (int r = 0; r < 5; r+=2) {
                    if ((checkMap.get(r).equals(null))|(checkMap.get(r+1).equals(null))) {
                        return newBook;
                    }
                    if ((books.get(i).get(r).equals(null))|(books.get(i).get(r+1).equals(null))) {
                        return newBook;
                    }
                    if ((checkMap.get(r).equals(books.get(i).get(r)))&(checkMap.get(r+1).equals(books.get(i).get(r+1)))) {
                        String str = checkMap.get(r) + "=" + checkMap.get(r+1);
                        newBook.add(str);
                    }
                }
            } return newBook;
    }
}

//END
