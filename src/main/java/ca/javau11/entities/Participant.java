package ca.javau11.entities;
public class Participant {

    private String name;
    private int age;
    private String ticket;
    
    public Participant(String name, int age, String ticket) {
        this.name = name;
        this.age = age;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", ticket: " + ticket;
    }
    
}