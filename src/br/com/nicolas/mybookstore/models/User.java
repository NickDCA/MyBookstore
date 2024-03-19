package br.com.nicolas.mybookstore.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.nicolas.mybookstore.models.OpenLibraryResult.OpenLibraryBook;

public class User {

    private String name;
    private List<Loan> loans;
    private double debt;

    public List<Book> search(String param) throws IOException, InterruptedException {

        String formattedParam = param.trim().replace(" ", "+");
        String url = "https://openlibrary.org/search.json?q=" + formattedParam;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = response.body();
        // System.out.println(json);
        OpenLibraryResult olResult = gson.fromJson(json, OpenLibraryResult.class);
        // System.out.println(result);

        List<Object> resultsList = new ArrayList<>(Arrays.asList(olResult.getDocs()));
        List<OpenLibraryBook> olBooks = new ArrayList<>();

        resultsList.forEach(result -> {
            String resultJson = gson.toJson(result);
            OpenLibraryBook olBook = gson.fromJson(resultJson, OpenLibraryBook.class);
            olBooks.add(olBook);
            // System.out.println(olBook.subject());
        });

        List<Book> books = new ArrayList<>();

        System.out.println("Search results: ");
        olBooks.forEach(olbook -> {
            Book book = new Book(olbook);
            books.add(book);
            System.out.println((books.indexOf(book) + 1) + ": " + book.userInfo());
        });

        return books;
    }

}
