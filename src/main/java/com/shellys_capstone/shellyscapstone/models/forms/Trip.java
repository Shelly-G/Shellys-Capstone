package com.shellys_capstone.shellyscapstone.models.forms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Trip {
    @GeneratedValue
    @Id
    Integer id;

    @Column(unique = true)
    @NotNull
    String tripname;


    public Trip() {
    }

    public Trip(Integer id, String tripname) {
        this.id = id;
        this.tripname = tripname;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripnamename) {
        this.tripname = tripname;
    }



}




