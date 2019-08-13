package com.shellys_capstone.shellyscapstone.models.forms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Expense {
    @GeneratedValue
    @Id
    Integer id;

    @Column(unique = true)
    @NotNull
    String expensename;


    public Expense() {
    }

    public Expense(Integer id, String expensename) {
        this.id = id;
        this.expensename = expensename;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpensename() {
        return expensename;
    }

    public void setExpensename(String expensename) {
        this.expensename = expensename;
    }



}



