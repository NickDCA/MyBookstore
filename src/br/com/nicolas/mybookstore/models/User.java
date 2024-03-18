package br.com.nicolas.mybookstore.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Loan> loans;
    private double debt;

    public List<Book> search(String param) {

        // Search by title, author, genre
        // Real-time availability

        List<Book> books = new ArrayList<>();
        return books;
    }

}
