package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        int count = 0;
        String gmail = "gmail.com";
        String ya = "yandex.ru";
        String hot = "hotmail.com";
        for (int i = 0; i<emails.size(); i++) {
            if (emails.get(i).contains(gmail)){
                count +=1;
            } else if (emails.get(i).contains(ya)) {
                count +=1;
            } else if (emails.get(i).contains(hot)) {
                count +=1;
            }
        }
        System.out.println(count);
        return count;
    }
}

// END
