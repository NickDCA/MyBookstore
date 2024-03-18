package br.com.nicolas.mybookstore.main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.nicolas.mybookstore.models.Book;
import br.com.nicolas.mybookstore.models.BookSearcher;
import br.com.nicolas.mybookstore.models.OpenLibraryResult;
import br.com.nicolas.mybookstore.models.OpenLibraryResult.OpenLibraryBook;

public class MyBookstore {
    public static void main(String[] args) throws Exception {

        // String url =
        // "https://openlibrary.org/search.json?title=the+lord+of+the+rings";

        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder()
        // .uri(URI.create(url))
        // .build();
        // HttpResponse<String> response = client
        // .send(request, HttpResponse.BodyHandlers.ofString());

        // Gson gson = new GsonBuilder()
        // .setPrettyPrinting()
        // .create();

        // String json = response.body();
        // // System.out.println(json);
        // OpenLibraryResult result = gson.fromJson(json, OpenLibraryResult.class);
        // // System.out.println(result);

        // json = gson.toJson(result.getDocs()[0]);
        // OpenLibraryBook apiBook = gson.fromJson(json, OpenLibraryBook.class);
        // System.out.println(apiBook);

        // Book myBook = new Book(apiBook);
        // System.out.println(myBook);

        BookSearcher bookSeacher = new BookSearcher();
        List<Book> testBooks = bookSeacher.searchByTitle("  the lord of the rings     ");
        // 'System.out.println("LISTA DE LIVROS PRINCIPAL TESTBOOKS: " + testBooks);
    }
}
