package com.example.basicsOfJPA;

import javax.persistence.*;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // it generates the different value for different card automatically
    private int cardNo;

    private String dob;

    @Enumerated(EnumType.STRING)     // it helps to store the value of enum in the form of varchar
    private Status status = Status.ACTIVATED;   // it is an Enum which is custom datatype to store the predefined values.

    @OneToOne   //@One is for the current class which is Card class and another One is for the user class
    @JoinColumn // to make the column of primary key which makes the foreign key for Card class
                // if we use @JoinColumn(key = anything) then we can make anything as a foreign key which is unique and not null.
                // by default foreign key is nothing but the primary key of the parent class
    User user;  // here we pass the whole class and from this with the help of @JoinColumn sql find the primary key
//why @JoinColumn is written in the child class because it will generate the foreign key for that class
    public Card() {
    }

    public Card(int cardNo, String dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    @Column(nullable = false, unique = true)
    // it helps to set the value which is not null, and it also allows only unique value
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
}