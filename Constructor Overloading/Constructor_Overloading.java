
class Product {

    String productName;
    double price;
    int quantity;

    // 1. No-argument constructor
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Constructor with product name
    Product(String productName) {
        this.productName = productName;
        price = 0.0;
        quantity = 0;
    }

    // 3. Constructor with product name and price
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 1;
    }

    // 4. Constructor with all three fields
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("--------------------------");
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {

        // Object using no-argument constructor
        Product p1 = new Product();

        // Object using product name constructor
        Product p2 = new Product("Laptop");

        // Object using name and price constructor
        Product p3 = new Product("Mouse", 500);

        // Object using all three arguments constructor
        Product p4 = new Product("Keyboard", 1200, 2);

        System.out.println("Product 1: No-argument Constructor");
        p1.display();

        System.out.println("Product 2: Name Constructor");
        p2.display();

        System.out.println("Product 3: Name and Price Constructor");
        p3.display();

        System.out.println("Product 4: All Arguments Constructor");
        p4.display();
    }
}
