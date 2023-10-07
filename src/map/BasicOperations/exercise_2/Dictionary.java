package map.BasicOperations.exercise_2;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public void removeWord(String word) {

        if(dictionary.isEmpty()) {
            System.out.println("Empty dictionary.");
        } else {

            String wordRemoved = dictionary.remove(word);

            if(wordRemoved == null) {
                System.out.println("This word is not in this dictionary");
            } else {
                System.out.println("Word removed.");
            }

        }

    }

    public String searchByWord(String word) {

        if(dictionary.isEmpty()) {
            System.out.println("Empty dictionary.");
            return null;
        } else {
            
            String definition = null;
            definition = dictionary.get(word);

            if(definition == null) {
                System.out.println("This word is not in this dictionary");
            } else {
                System.out.println("The definition for " + word + " is: " + definition);
            }
            
            return definition;

        }

    }

    public void displayWords() {

        if(dictionary.isEmpty()) {
            System.out.println("Empty dictionary.");
        } else {
            System.out.println(dictionary);
        }

    }

}
