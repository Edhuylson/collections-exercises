package set.Sorting.exercise_2;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
    
    private String name;
    private long registrationNumber;
    private double gpa;

    public Student(String name, long registrationNumber, double gpa) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public int compareTo(Student s) {
        return name.compareToIgnoreCase(s.getName());
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if(!(o instanceof Student)) return false;

        Student student = (Student) o;
        return Objects.equals(getRegistrationNumber(), student.getRegistrationNumber());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegistrationNumber());
    }

    @Override
    public String toString() {
        return "Student{" + name + ", " + registrationNumber + ", " + gpa + "}";
    }

}

class ComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGPA(), s2.getGPA());
    }

}