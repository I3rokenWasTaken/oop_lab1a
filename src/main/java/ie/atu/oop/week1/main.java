package ie.atu.oop.week1;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args)
    {

        Book firstBook = createBook("dune", "Frank Herbert", 412);
        Book secondBook = createBook("Clean Code", "Robert C. Martin", 464);
        Book thirdBook = createBook("The C Programming Language", "Kernighan and Ritchie", 274);

        System.out.println("\n");
        firstBook.displayDetails();
        System.out.println("\n");
        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();

        firstBook.borrowBook();
        firstBook.displayDetails();
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
