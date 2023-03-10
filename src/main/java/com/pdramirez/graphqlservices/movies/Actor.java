package com.pdramirez.graphqlservices.movies;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity()
@Table(name = "ACTORS")
public class Actor extends Person{

    private int cantAct;
    public Actor() {
        super();
    }

    public Actor(int cantAct) {
        this.cantAct = cantAct;
    }

    public Actor(String firstName, String lastName, Date birthDate, int cantAct) {
        super(firstName, lastName, birthDate);
        this.cantAct = cantAct;
    }

    public int getCantAct() {
        return cantAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return cantAct == actor.cantAct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantAct);
    }

    public void setCantAct(int cantAct) {
        this.cantAct = cantAct;
    }
}
