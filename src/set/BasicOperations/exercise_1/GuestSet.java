package set.BasicOperations.exercise_1;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    
    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode) {
        guestSet.add(new Guest(name, invitationCode));
    }

    public void removeGuestByInvitationCode(int invitationCode) {

        Guest guestToRemove = null;

        if(!guestSet.isEmpty()) {
            
            for(Guest g : guestSet) {

                if(g.getCode() == invitationCode) {
                    guestToRemove = g;
                    break;
                }

            }

            if(guestToRemove != null) {
                guestSet.remove(guestToRemove);
            } else {
                throw new RuntimeException("Guest with invitation code " + invitationCode + " not found.");
            }

        } else {
            throw new RuntimeException("This set is empty.");
        }
    }

    public int countGuests() {

        if(!guestSet.isEmpty()) {
            return guestSet.size();
        }else {
            throw new RuntimeException("This set is empty.");
        }
        
    }

    public void displayGuests() {

        if(guestSet.isEmpty()) {
            System.out.println("This set is empty.");
        } else {
            System.out.println(guestSet);
        }

    }

}
