package set.Research.exercise_2;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TaskList {
    
    private Set<Task> tasklist;

    public TaskList() {
        this.tasklist = new HashSet<>();
    }

    public void addTask(String description) {
        tasklist.add(new Task(description));
    }

    public void displayTasks() {

        if(!tasklist.isEmpty()) {
            System.out.println(tasklist);
        } else {
            System.out.println("No tasks.");
        }

    }

    public void removeTask(String description) {

        if(!tasklist.isEmpty()) {

            Iterator<Task> iterator = tasklist.iterator();

           while(iterator.hasNext()) {
                Task t = iterator.next();

                if(t.getDescription().equalsIgnoreCase(description)) {
                    iterator.remove();
                    System.out.println("Task removed successfully.");
                    return;
                }
           }

            System.out.println("No task with this description.");

        } else {
            System.out.println("No tasks.");
        }

    }

    public int countTasks() {
        return tasklist.size();
    }

    public Set<Task> getCompletedTasks() {

        if(!tasklist.isEmpty()) {
            
            Set<Task> completedTasks = new HashSet<>();

            for(Task t : tasklist) {

                if(t.getCompleted() == true) {
                    completedTasks.add(t);
                }

            }

            if(completedTasks.isEmpty()) {
                throw new RuntimeException("No completed tasks.");
            } else {
                return completedTasks;
            }

        } else {
            throw new RuntimeException("No tasks.");
        }

    }

    public Set<Task> getPendingTasks() {

        if(!tasklist.isEmpty()) {
            
            Set<Task> pandingTasks = new HashSet<>();

            for(Task t : tasklist) {

                if(t.getCompleted() == false) {
                    pandingTasks.add(t);
                }

            }

            if(pandingTasks.isEmpty()) {
                throw new RuntimeException("No panding tasks.");
            } else {
                return pandingTasks;
            }

        } else {
            throw new RuntimeException("No tasks.");
        }

    }

    public void markTaskAsCompleted(String description) {

        if(!tasklist.isEmpty()) {
            
            boolean taskFound = false;

            for(Task t : tasklist) {

                if(t.getDescription().equalsIgnoreCase(description)) {

                    taskFound = true;
                    t.setCompleted(true);
                    break;

                }

            }

            if(taskFound == false) {
                System.out.println("No task with this description.");
            } else {
                System.out.println("Task marked as completed successfully.");
            }

        } else {
            System.out.println("No tasks.");
        }

    }

    public void markTaskAsPending(String description) {

        if(!tasklist.isEmpty()) {
            
            boolean taskFound = false;

            for(Task t : tasklist) {

                if(t.getDescription().equalsIgnoreCase(description)) {

                    taskFound = true;
                    t.setCompleted(false);
                    break;

                }

            }

            if(taskFound == false) {
                System.out.println("No task with this description.");
            } else {
                System.out.println("Task marked as pending successfully.");
            }

        } else {
            System.out.println("No tasks.");
        }

    }

    public void clearTaskList() {
        tasklist.clear();
    }

}