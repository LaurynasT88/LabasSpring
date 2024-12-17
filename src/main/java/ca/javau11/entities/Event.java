package ca.javau11.entities;
import java.time.LocalDate;
import java.util.List;

public class Event {

    private String event;
    private LocalDate date;
    private List<Participant> participants;
    
    public Event(String event, String date, List<Participant> participants) {
        this.event = event;
        this.date = LocalDate.parse(date); // Convert String to LocalDate
        this.participants = participants;
    }

   

	public String getEvent() {
        return event;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "event: " + event + ", date: " + date + ", participants: " + participants;
    }
    
    public long calculateVipMembers(List<Participant> participants) {
        return participants.stream()
                .filter(p -> p.getTicket().equals("VIP"))
                .count();
    }
}
 
