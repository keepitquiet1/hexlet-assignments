package exercise;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

// BEGIN
public class App {
public static boolean scrabble(String symbols, String word) {

        String lowerSymbols = symbols.toLowerCase(Locale.ROOT);
        String lowerWord = word.toLowerCase(Locale.ROOT);
        int countOfSymbols = 0;
        for (int r = 0; r <= lowerWord.length() - 1; r++) {
                }
                else if (countOfSymbols >= lowerSymbols.length()) {
                        return false;
                }
                else if (lowerWord.charAt(r)==(lowerSymbols.charAt(countOfSymbols))) {
                        lowerSymbols = lowerSymbols.replaceAll(String.valueOf(lowerSymbols.charAt(r)), "");
                } else if (!(lowerWord.charAt(r)==(lowerSymbols.charAt(countOfSymbols)))) {
                        countOfSymbols += 1;
                        r -= 1;
                } else {
                        System.out.println("false");
                        return false;
                }
        }
        for (int s = 0; s < lowerWord.length(); s++) {
                if (!(lowerSymbols.equals(lowerWord))) {
                        return false;
                }
        }
        return true;

}
}

//END
