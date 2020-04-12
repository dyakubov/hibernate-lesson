package ru.geekbrains.hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private LocalDate birthday;

    @OneToMany(
            mappedBy = "person",
            cascade = CascadeType.ALL
    )
    private List<Contact> contacts;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthday, List<Contact> contacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.contacts = contacts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", contacts=" + contacts +
                '}';
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
