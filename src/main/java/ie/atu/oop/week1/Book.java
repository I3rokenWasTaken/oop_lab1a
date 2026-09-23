package ie.atu.oop.week1;

public class Book {

    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails() {
        System.out.println("Book title is: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book page count: " + pageCount);
        System.out.println("Book available: " + available);

    }

    public void borrowBook() {

        if (available) {
            available = false;
            System.out.println(title + " has been borrowed");
        } else {
            System.out.println(title + " is already on loan");
        }

    }

}
