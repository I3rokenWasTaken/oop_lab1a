package ie.atu.oop.week1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args)
    {

        Book firstbook = new Book();
        firstbook.title = "Dune";
        firstbook.author = "Frank Herbert";
        firstbook.pageCount = 412;

        //before loan
        firstbook.displayDetails();
        firstbook.borrowBook();
        //after loan
        firstbook.displayDetails();

        Book secondbook = createBook("Clean Code", "Dan Williams", 223);
        Book thirdbook = createBook("Another Book Code", "John Murphy", 333);
        Book fourthbook = createBook("Student Life", "Merry Shelley", 442);

        System.out.println("\n");
        secondbook.displayDetails();
        System.out.println("\n");
        thirdbook.displayDetails();
        System.out.println("\n");
        fourthbook.displayDetails();
    }

    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}
