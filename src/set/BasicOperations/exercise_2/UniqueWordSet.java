package set.BasicOperations.exercise_2;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordSet {
    
    private Set<String> uniqueWords;

    public UniqueWordSet() {
        this.uniqueWords = new HashSet<>();
    }

    public void addWord(String word) {
        uniqueWords.add(word);
    }

    public void removeWord(String word) {

        if(!uniqueWords.isEmpty()) {
            
            if(uniqueWords.contains(word)) {
                uniqueWords.remove(word);
            } else {
                System.out.println("The word is not present in the set.");
            }

        } else {
            System.out.println("The set is empty.");
        }

    }

    public void chechWord(String word) {

        if(!uniqueWords.isEmpty()) {
            
            if(uniqueWords.contains(word)) {
                System.out.println("The word is present in the set.");
            } else {
                System.out.println("The word is not present in the set.");
            }

        } else {
            System.out.println("The set is empty.");
        }

    }

    public void displayUniqueWords() {

        if(!uniqueWords.isEmpty()) {
            System.out.println(uniqueWords);
        } else {
            System.out.println("The set is empty.");
        }

    }

}
