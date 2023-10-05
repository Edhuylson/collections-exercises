package set.BasicOperations.exercise_1;

import java.util.Objects;

public class Guest {
    
    private String name;
    private int invitationCode;

    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return invitationCode;
    }

    @Override
    public boolean equals(Object o) {

        if(this == o) return true;

        if(!(o instanceof Guest)) return false;

        Guest guest = (Guest) o;

        return getCode() == guest.getCode();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "Name: " + name  + " Code: " + invitationCode;
    }

}
