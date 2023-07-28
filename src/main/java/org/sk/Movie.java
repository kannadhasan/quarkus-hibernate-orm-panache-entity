package org.sk;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Movie extends PanacheEntity {
    @Column(length=100)
    public String title;
    @Column(length = 200)
    public String description;     
    public String director;
    public String country;
}
