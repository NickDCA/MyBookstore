package br.com.nicolas.mybookstore.models;

import java.util.Arrays;

public class OpenLibraryResult {

    private Object[] docs;

    @Override
    public String toString() {
        return "OpenLibraryResult [docs=" + Arrays.toString(docs) + "]";
    }

    public record OpenLibraryBook(String[] author_name,
            String ebook_access,
            String ebook_count_i,
            String first_publish_year,
            String[] publisher,
            String title,
            String[] subject) {

    }

    public Object[] getDocs() {
        return docs;
    }

}
