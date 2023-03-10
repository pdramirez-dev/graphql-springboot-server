package com.pdramirez.graphqlservices.movies;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;



@Entity
@Table(name = "MOVIES")
public class Movie {
    @Id @GeneratedValue
    private Long id;
    private String title ;
    @ManyToMany
    @JoinTable(name = "DIRECTORS" , joinColumns = {@JoinColumn(name = "fk_movie")},
    inverseJoinColumns = {@JoinColumn(name = "fk_director")} )
    private HashSet<Director> directors;
    @ManyToMany
    @JoinTable(name = "ACTORS",joinColumns = {@JoinColumn(name = "fk_movie")},
            inverseJoinColumns = {@JoinColumn(name = "fk_actors")}
    )
    private HashSet<Actor> actors;
    private Date releaseDate;


}
