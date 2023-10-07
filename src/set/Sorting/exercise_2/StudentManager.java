package set.Sorting.exercise_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    
    private Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }

    public void addStudent(String name, long registrationNumber, double gpa) {
        students.add(new Student(name, registrationNumber, gpa));
    }

    public void removeStudent(long registrationNumber) {

        if(!students.isEmpty()) {
            
            Iterator<Student> iterator = students.iterator();

            while(iterator.hasNext()) {

                Student s = iterator.next();
                
                if(s.getRegistrationNumber() == registrationNumber) {
                    iterator.remove();
                    System.out.println("Student removed successfully.");
                    return;
                }

            }

            System.out.println("No students with this registration number.");

        } else {
            throw new RuntimeException("No students found.");
        }

    }

    public Set<Student> displayStudents() {

        if(!students.isEmpty()) {
            return students;
        } else {
            throw new RuntimeException("No students found.");
        }

    }

    public Set<Student> displayStudensByName() {

        if(!students.isEmpty()) {
            
            Set<Student> studentsByName = new TreeSet<>(students);
            return studentsByName;

        } else {
            throw new RuntimeException("No students found.");
        }
        
    }

    public Set<Student> displayStudensByGPA() {
        
        if(!students.isEmpty()) {
            
            Set<Student> studentsByGPA = new TreeSet<>(new ComparatorByGPA());
            studentsByGPA.addAll(students);
            return studentsByGPA;

        } else {
            throw new RuntimeException("No students found.");
        }

    }

}
