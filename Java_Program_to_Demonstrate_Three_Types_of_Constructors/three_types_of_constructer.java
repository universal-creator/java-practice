
class Book {

    String title;
    String author;
    double price;

    // 1. No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // 2. Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 3. Copy constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}

public class three_types_of_constructer {
    public static void main(String[] args) {

        // Object using no-argument constructor
        Book b1 = new Book();

        // Object using parameterized constructor
        Book b2 = new Book("Java Programming",
                           "James Gosling", 500);

        // Object using copy constructor
        Book b3 = new Book(b2);

        System.out.println("Book 1 (No-argument Constructor):");
        b1.display();

        System.out.println("Book 2 (Parameterized Constructor):");
        b2.display();

        System.out.println("Book 3 (Copy Constructor):");
        b3.display();

        // Modifying copied object
        b3.price = 700;
        b3.title = "Advanced Java";

        System.out.println("After Modifying Book 3:");

        System.out.println("Original Book 2:");
        b2.display();

        System.out.println("Copied Book 3:");
        b3.display();
    }
}
// No-argument constructor initializes objects with predefined values.

// Parameterized constructor initializes objects with user-provided values.

// Copy constructor creates a new object by copying values from an existing object.