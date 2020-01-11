package com.example.first.book;

import javax.persistence.*;

@Entity
@Table(name = "book_test")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long b_id;

    private String b_name;

    private long b_price;

    public long getB_id() {
        return b_id;
    }

    public void setB_id(long b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public long getB_price() {
        return b_price;
    }

    public void setB_price(long b_price) {
        this.b_price = b_price;
    }
}
