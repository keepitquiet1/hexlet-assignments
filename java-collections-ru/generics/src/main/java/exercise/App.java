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
            for (int i = 0; i < books.size(); i++) {
                for (Map.Entry<String, String> check : checkMap.entrySet()) {
                    boolean bool = ((books.get(i).containsKey(check.getKey()))&(books.get(i).containsValue(check.getValue())));
                    if (bool == true) {
                        count+=1;
                    }
                    else if (bool==false) {
                        count = 0;
                    }
                    if (count>checkMap.size()) {
                        newBook.add(books.get(i));
                    }
                    System.out.println("count is " + count);
                    System.out.println(newBook);
                    System.out.println("check is " + check);
                }
            } System.out.println("final is: " + newBook);
        return newBook;
    }
}

//END
