package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        String[] sentenceArr = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();
        if (sentence.equals("")) {
            return wordsCount;
        }
        for (String word : sentenceArr) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 0);
            }
            wordsCount.put(word, wordsCount.get(word) + 1);
            }
            return wordsCount;
    }
    public static String toString(Map wordsCount) {
        Map<String, Integer> newMap = new HashMap<>();
        String str = "{\n";
        if (wordsCount == null) {
            return "{}";
        }
        for (Object word : wordsCount.keySet()) {
            str = str + "  " + word + ": " + wordsCount.get(word) + "\n";
        }
        str = str + "}";
        return str;
    }
}

//END
