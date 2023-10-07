package set.Research.exercise_2;

import java.util.Objects;

public class Task {
    
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completedFlag) {
        this.isCompleted = completedFlag;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;
        if(!(o instanceof Task)) return false;

        Task task = (Task) o;
        return Objects.equals(getDescription(), task.getDescription());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }

    @Override
    public String toString() {

        if(isCompleted == true) {
            return description + " - Completed";
        } else {
            return description + " - Pending";
        }
        
    }

}
