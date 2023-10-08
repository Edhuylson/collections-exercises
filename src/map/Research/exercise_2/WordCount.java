package map.Research.exercise_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    
    private Map<String, Integer> words;

    public WordCount() {
        this.words = new HashMap<>();
    }

    public void addWord(String word, Integer count) {
        words.put(word, count);
    }

    public void removeWord(String word) {

        if(words.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            
            Integer wordRemoved = words.remove(word);

            if(wordRemoved == null) {
                System.out.println("The word is not in the map.");
            } else {
                System.out.println("Word removed.");
            }
            
        }

    }

    public void displayWordsCount() {

        if(words.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println(words);
        }

    }

    public Map<String, Integer> findMostFrequentWord() {

        if(words.isEmpty()) {
            System.out.println("The map is empty.");
            return null;
        } else {
            
            Map<String, Integer> frequentWord = new HashMap<>();
            int maxCount = 0;

            for(Map.Entry<String, Integer> entry : words.entrySet()) {

                int count = entry.getValue();

                if(count > maxCount) {

                    maxCount = count;
                    frequentWord.clear();
                    frequentWord.put(entry.getKey(), entry.getValue());

                } else if(count == maxCount) {
                    frequentWord.put(entry.getKey(), entry.getValue());
                }

            }

            return frequentWord;

        }

    }

}
