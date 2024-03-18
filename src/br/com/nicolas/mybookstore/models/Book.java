package br.com.nicolas.mybookstore.models;

import br.com.nicolas.mybookstore.models.OpenLibraryResult.OpenLibraryBook;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int publicationYear;
    private String subject;
    private int availableQuantity;
    private boolean available;

    public Book(OpenLibraryBook olBook) {
        this.title = olBook.title();
        if (olBook.author_name() == null) {
            this.author = "unknown";
        } else {
            this.author = olBook.author_name()[0];
        }

        if (olBook.publisher() == null) {
            this.publisher = "";
        } else {
            this.publisher = olBook.publisher()[0];
        }

        if (olBook.first_publish_year() == null) {
            this.publicationYear = 0;
        } else {
            this.publicationYear = Integer.parseInt(olBook.first_publish_year().replace(".0", ""));
        }

        if (olBook.subject() == null) {
            this.subject = "";
        } else {
            this.subject = olBook.subject()[0];
        }

        this.availableQuantity = Integer.parseInt(olBook.ebook_count_i().replace(".0", ""));
        if (this.availableQuantity > 0) {
            available = true;
        } else {
            available = false;
        }
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publicationYear="
                + publicationYear + ", subject=" + subject + ", availableQuantity=" + availableQuantity + "]";
    }

}
