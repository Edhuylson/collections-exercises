package list.BasicOperations.exercise_1;

import java.util.ArrayList;
import java.util.List;

public class TasksList {
    
    private List<Task> tasksList;

    public TasksList() {
        this.tasksList = new ArrayList<>();
    }

    public void addTask(String description) {
        tasksList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();

        for(Task t : tasksList) {

            if(t.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(t);
            }

        }

        tasksList.removeAll(tasksToRemove);
    }

    public int getTotalNumberOfTasks() {
        return tasksList.size();
    }

    public void getTaskDescriptions() {
        System.out.println(tasksList);
    }

}
