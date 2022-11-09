package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
public static List findWhere(List<Map<String, String>> books, Map<String, String> checkMap) {
        List<Map<String, String>> newBook = new ArrayList<>();
        for (int i = 0; i<books.size(); i++) {
            for (Map.Entry<String, String> book : books.get(i).entrySet()) {
                for (Map.Entry<String, String> check : checkMap.entrySet()) {
                    if (check.getValue().equals(book.getValue())) {
                        newBook.add(books.get(i));
                    }
                }
            }
        } System.out.println(newBook);
        return newBook;
    }
}

