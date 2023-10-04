package list.Sorting.exercise_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorting {
    
    private List<Person> personList;

    public PersonSorting() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        personList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> peopleByAge = new ArrayList<>(personList);

        if(!peopleByAge.isEmpty()) {
            Collections.sort(peopleByAge);
            return peopleByAge;
        } else {
            throw new RuntimeException("This list is empty.");
        }
        
    }

    public List<Person> sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(personList);

        if(!peopleByHeight.isEmpty()) {
            Collections.sort(peopleByHeight, new ComparatorByHeight());
            return peopleByHeight;
        } else {
            throw new RuntimeException("This list is empty.");
        }
        
    }

}
