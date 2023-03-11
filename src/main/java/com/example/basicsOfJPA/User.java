package com.example.basicsOfJPA;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                         // it tells that this is the Model class whose table was to be created
@Table(name = "User_Info")      // it helps to change the name of the table otherwise by default the name of the table is User
public class User {
    // columns of the table is nothing but the variables which we define in the User.
    // column name is rollNo, name, age, mobNo.
    @Id         //@Id tells that this is the primary key
    @Column(name = "id")    // it helps to change the column name if we want to change the column name from rollNo to id.
    private int rollNo;

    private String name;
    private int age;
    private String mobNo;

    public User() {
    }

    public User(int rollNo, String name, int age, String mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}