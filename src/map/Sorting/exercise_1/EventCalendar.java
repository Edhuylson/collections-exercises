package map.Sorting.exercise_1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventCalendar {
    
    private Map<LocalDate, Event> events;

    public EventCalendar() {
        this.events = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        events.put(date, new Event(name, attraction));
    }

    public void displayCalendar() {

        if(events.isEmpty()) {
            System.out.println("There are no events on calendar.");
        } else {

            Map<LocalDate, Event> ascendingEvents = new TreeMap<>(events);
            System.out.println(ascendingEvents);

        }

    }

    public void getNextEvent() {

        if(events.isEmpty()) {
            System.out.println("There are no events on calendar.");
        } else {

            LocalDate currentDate = LocalDate.now();
            Map<LocalDate, Event> ascendingEvents = new TreeMap<>(events);
            boolean foundNextEvent = false;

            for(Map.Entry<LocalDate, Event> entry : ascendingEvents.entrySet()) {

                if(entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                    System.out.println("The next event is: " + entry.getValue() + " and will happen on: " + entry.getKey());
                    foundNextEvent = true;
                    break;
                }

            }

            if(!foundNextEvent) {
                System.out.println("No upcoming events found.");
            }

        }

    }

}
