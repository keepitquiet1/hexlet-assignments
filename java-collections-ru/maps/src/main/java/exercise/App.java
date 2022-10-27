package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        String[] sentenceArr = sentence.split(" ");
        Map<String, Integer> wordsCount = new HashMap<>();
            for (String word : sentenceArr) {
                if (!wordsCount.containsKey(word)) {
                    wordsCount.put(word, 0);
                }
                wordsCount.put(word, wordsCount.get(word) + 1);
            }
            System.out.println(wordsCount);
            return wordsCount;
    }
    public static String toString(Map wordsCount) {
        Map<String, Integer> newMap = new HashMap<>();
        String str = "\n";
        for (Object word : wordsCount.keySet()) {
            str = str + "\n  " + word + ": " + wordsCount.get(word);
        } System.out.println(str);
        return str;
    }
}

//END
