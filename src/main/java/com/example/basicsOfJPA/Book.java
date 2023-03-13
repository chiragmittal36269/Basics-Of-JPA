package com.example.basicsOfJPA;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int bookId;

    private String title;

    private int price;

    @ManyToOne  // many denotes current class which is book class(child) and one denotes author class(parent)
    @JoinColumn     // it creates the foreign key column in the book table so that it can be accessible by primary key of author table
    Author author;  // here we pass the whole class and from this with the help of @JoinColumn sql find the primary key
    // it creates the column in the book table whose name is PrimaryKeyTableName_name of primary key
    // like author_author_id;       //nameOfClass_nameOfPrimaryKey

    public Book() {
    }

    public Book(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
