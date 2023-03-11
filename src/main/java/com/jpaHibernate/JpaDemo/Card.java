package com.jpaHibernate.JpaDemo;

import javax.persistence.*;

@Entity
public class Card {

    @Id

    //this will auto increment the PK. Identity means separate from other tables.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;

    // we can pass arg like this to make changes in column structure
    @Column(nullable = false, unique = true)
    private String dob;

    // we will have to tell mysql that process this status variable as a string varchar
    @Enumerated(EnumType.STRING)
    private Status status;

    // to connect with parent primary key so first tell me the relation like one to one  or one to many like that
    // after that write @JoinColumn to connect,
    // so it will connect automatically with primary key of parent table
    // if we want to connect with another key instead of PK we will have to tell it explicitly
    @OneToOne
    @JoinColumn
    User user;

    public Card() {
    }

    public Card(int cardId, String dob, Status status, User user) {
        this.cardId = cardId;
        this.dob = dob;
        this.status = status;
        this.user = user;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
