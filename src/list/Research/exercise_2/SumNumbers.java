package list.Research.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
    
    private List<Integer> numbersList;

    public SumNumbers() {
        this.numbersList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbersList.add(number);

    }

    public int calculateSum(){
       int sum = 0;

       if(numbersList.isEmpty()) {
            throw new RuntimeException("This list is empty.");
       } else {

            for(int n : numbersList) {
                sum += n;
            }

            return sum;

       }
    }

    public int findLargestNumber() {
        
        if(numbersList.isEmpty()) {
            throw new RuntimeException("This list is empty.");
       } else {
            int largestNumber = numbersList.get(0);

            for(int n : numbersList) {

                if(n >= largestNumber) {
                    largestNumber = n;
                }

            }

            return largestNumber;
       }

    }

    public int findSmallestNumber() {
        
        if(numbersList.isEmpty()) {
            throw new RuntimeException("This list is empty.");
       } else {
            int smallestNumber = numbersList.get(0);

            for(int n : numbersList) {

                if(n <= smallestNumber) {
                    smallestNumber = n;
                }

            }

            return smallestNumber;

        }

    }

    public void displayNumbers() {
        
        if(!numbersList.isEmpty()) {
            System.out.println(this.numbersList);
        } else {
            System.out.println("This list is empty!");
        }

    }

}
