package exercise;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

// BEGIN
public   {
    public static boolean scrabble(  ) {
        String lowerSymbols = symbols.toLowerCase(Locale.ROOT);
        String lowerWord = word.toLowerCase(Locale.ROOT);
        List<String> listOfSymbols = new ArrayList<>();
        List<String> listOfWords = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < lowerSymbols.length(); i++) {
            listOfSymbols.add(String.valueOf(lowerSymbols.charAt(i)));
        }
        for (int x = 0; x < lowerWord.length(); x++ ) {
            listOfWords.add(String.valueOf(lowerWord.charAt(x)));
        }
        int countOfSymbols = 0;
        for (int r = 0; r < lowerWord.length(); r++) {
            if (listOfWords.get(r).equals(listOfSymbols.get(countOfSymbols))) {
                newList.add(listOfSymbols.get(countOfSymbols));
                listOfSymbols.remove(countOfSymbols);
                countOfSymbols = 0;
            } else if (!(listOfWords.get(r).equals(listOfSymbols.get(countOfSymbols)))) {
                countOfSymbols +=1;
                r -=1;
            }
        }
        for (int s = 0; s < lowerWord.length(); s++) {
            if (!(newList.get(s).equals(listOfWords.get(s)))) {
                return false;
            }
        }
            return true;
    }
}

//END
