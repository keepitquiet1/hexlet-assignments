package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List findWhere(List<Map<String, String>> books, Map<String, String> checkMap) {
        List<Map<String, String>> newBook = new ArrayList<>();
        int count = 0;
        for (int i = 0; i<books.size(); i++) {
            for (Map.Entry<String, String> book : books.get(i).entrySet()) {
                for (Map.Entry<String, String> check : checkMap.entrySet()) {
                    boolean bool = (check.getValue().equals(book.getValue()));
                    if (bool==false) {
//                        newBook.add(books.get(i));
                        count+=1;
                        break;
                    } else if (bool) {
                        newBook.add(books.get(i));
                    } if (count==1) {
                        newBook.remove(i);
                    }
                }
            }
        } System.out.println(newBook);
        return newBook;
    }
}

//END
