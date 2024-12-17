package ca.javau11.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import ca.javau11.entities.Event;
import ca.javau11.entities.Participant;

@Service
public class EventService {

    public Event getEvent(String eventName) {
        return new Event(eventName, LocalDate.now().toString(), getParticipants());
    }

    public List<Participant> getParticipants() {
        return List.of(
            new Participant("Arminas", 34, "regular"),
            new Participant("Alice", 18, "vip"),
            new Participant("Bob", 29, "regular")
        );
    }
}
