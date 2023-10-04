package list.Sorting.exercise_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting {
    private List<Integer> numbers;

    public NumberSorting() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> sortAscending() {
        if(!numbers.isEmpty()) {
            Collections.sort(numbers);
            return numbers;
        } else {
            throw new RuntimeException("This list is empty.");
        }
    }

    public List<Integer> sortDescending() {
        if(!numbers.isEmpty()) {
            numbers.sort(Collections.reverseOrder());
            return numbers;
        } else {
            throw new RuntimeException("This list is empty.");
        }
        
    }

}
