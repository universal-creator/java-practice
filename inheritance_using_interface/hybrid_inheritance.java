
// Base class
class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

// First interface
interface Printable {
    void print();
}

// Second interface
interface Scannable {
    void scan();
}

// Derived class
class SmartPrinter extends Machine
        implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    void display() {
        System.out.println("Smart Printer is ready.");
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {

        SmartPrinter printer = new SmartPrinter();

        printer.start();    // Inherited from Machine
        printer.print();    // From Printable
        printer.scan();     // From Scannable
        printer.display();  // Own method
    }
}
