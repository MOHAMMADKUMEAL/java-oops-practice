import java.util.Scanner;

class Book {
    // Private attributes
    private String ISBN;
    private String title;
    private String author;
    private float price;

    // Getter methods
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    // Setter methods
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();

        // Taking input
        book.setISBN(sc.nextLine());
        book.setTitle(sc.nextLine());
        book.setAuthor(sc.nextLine());
        book.setPrice(sc.nextFloat());

        // Displaying output
        System.out.println(book.getISBN());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());

        sc.close();
    }
}
