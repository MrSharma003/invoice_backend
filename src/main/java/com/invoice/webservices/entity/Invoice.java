package com.invoice.webservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String description;
    private long value;
    private long quantity;
    private long amount;

    protected Invoice(){
        //empty constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Invoice(Long id, String username, String description, long value, long quantity, long amount) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.value = value;
        this.quantity = quantity;
        this.amount = amount;
    }

}

