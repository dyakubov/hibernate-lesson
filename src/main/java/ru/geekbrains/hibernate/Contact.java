package ru.geekbrains.hibernate;

import javax.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String type;

    @Column
    private String info;

    @ManyToOne
    private Person person;

    public Contact() {
    }

    public Contact(String type, String info) {
        this.type = type;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", info='" + info + '\'' +
                ", person=" + person +
                '}';
    }
}
