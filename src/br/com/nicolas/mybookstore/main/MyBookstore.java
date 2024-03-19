package br.com.nicolas.mybookstore.main;

import java.util.List;
import java.util.Scanner;

import br.com.nicolas.mybookstore.models.Book;
import br.com.nicolas.mybookstore.models.User;

public class MyBookstore {
    public static void main(String[] args) throws Exception {

        User user = new User();
        String control;
        Scanner in = new Scanner(System.in);
        String param;
        while (true) {
            System.out.println("Enter a search param: ");
            param = in.nextLine();
            List<Book> testBooks = user.search(param);
            System.out.println("Do you wish to reserve a book? [Y/N]");
            control = in.nextLine();
        }

        // 'System.out.println("LISTA DE LIVROS PRINCIPAL TESTBOOKS: " + testBooks);
    }
}
