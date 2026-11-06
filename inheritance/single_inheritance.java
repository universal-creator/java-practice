
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model = "Fortuner";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();       
        c.display();
    }
}
