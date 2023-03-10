package com.pdramirez.graphqlservices.movies;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "DIRECTORS")
public class Director extends Person{
    private int cantProd;
    public Director() {
        super();
    }


    public Director(String firstName, String lastName, Date birthDate, int cantProd) {
        super(firstName, lastName, birthDate);
        this.cantProd = cantProd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director director)) return false;
        if (!super.equals(o)) return false;
        return cantProd == director.cantProd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantProd);
    }
}
