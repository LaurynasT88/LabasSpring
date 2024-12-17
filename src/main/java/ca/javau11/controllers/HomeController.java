package ca.javau11.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.javau11.entities.Event;
import ca.javau11.entities.Participant;
import ca.javau11.entities.Student;
import ca.javau11.services.EventService;
import ca.javau11.services.StudentService;

@RestController
public class HomeController {

    private final StudentService studentService;
    private final EventService eventService;

    // Constructor injection for dependencies
    public HomeController(StudentService studentService, EventService eventService) {
        this.studentService = studentService;
        this.eventService = eventService;
    }

    @GetMapping("/labas")
    public String hello(@RequestParam(defaultValue = "Pasauli") String name) {
        return String.format("Labas %s!", name);
    }

    @GetMapping("/student")
    public Student getStudent(@RequestParam(defaultValue = "noname") String name) {
        return studentService.getStudent(name);
    }

    @GetMapping("/dummy")
    public Student getDummyData() {
        return studentService.getDummyStudent();
    }

    @GetMapping("/event")
    public Event getEvent(@RequestParam(defaultValue = "defaultEvent") String eventName) {
        return eventService.getEvent(eventName);
    }

    @GetMapping("/participants")
    public List<Participant> getParticipants() {
        return eventService.getParticipants();
    }

    @GetMapping("/rytas")
    public String rytas() {
        return "Labas rytas";
    }

    @GetMapping("/diena")
    public String diena() {
        return "Laba diena";
    }

    @GetMapping("/vakaras")
    public String vakaras() {
        return "Labas vakaras";
    }

    @GetMapping("/naktis")
    public String naktis() {
        return "Laba naktis";
    }
}
