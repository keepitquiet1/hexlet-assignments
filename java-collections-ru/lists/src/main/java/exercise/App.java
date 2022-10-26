package exercise;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

// BEGIN
public class App {
public static boolean scrabble(String symbols, String word){
        String lowerWord = word.toLowerCase(Locale.ROOT);
        String lowerSymbols = symbols.toLowerCase(Locale.ROOT);
        int countOfSymbols = 0;
        String newWord = "";
        for (int r = 0; r < lowerWord.length(); r++) {
                if (countOfSymbols >= lowerSymbols.length()) {
                        return false;
                }
                else if (lowerWord.charAt(r)==(lowerSymbols.charAt(countOfSymbols))) {
                        String hlowerSymbols = lowerSymbols.replaceFirst(String.valueOf(lowerSymbols.charAt(countOfSymbols)), "");
                        newWord = newWord + lowerSymbols.charAt(countOfSymbols);
                        countOfSymbols = 0;
                        lowerSymbols = hlowerSymbols;
                } else if (lowerWord.charAt(r)!=(lowerSymbols.charAt(countOfSymbols))) {
                        countOfSymbols += 1;
                        r -= 1;
                } System.out.println("1" + lowerWord);
                System.out.println("2" + newWord);
                System.out.println("3" + lowerSymbols);
                System.out.println("счет" + countOfSymbols);
        }

        for (int s = 0; s < lowerWord.length(); s++) {
                if (!(newWord.equals(lowerWord))) {
                        return false;
                }
        }
        return true;

}
}

//END
