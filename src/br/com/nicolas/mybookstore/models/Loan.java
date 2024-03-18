package br.com.nicolas.mybookstore.models;

import java.util.Date;

public class Loan {
    private Book book;
    private Date checkIn;
    private Date checkOut;
    private double fee;

    public Loan(Book book, Date checkIn, Date checkOut, double fee) {
        this.book = book;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.fee = fee;
    }

}
