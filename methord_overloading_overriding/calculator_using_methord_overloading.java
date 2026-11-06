class Calculator {

    // Addition of two integers
    int add(int a, int b) {
        return a + b;
    }

    // Addition of three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Addition of two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class calculator_using_methord_overloading{
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: "
                + calc.add(10, 20));

        System.out.println("Addition of three integers: "
                + calc.add(10, 20, 30));

        System.out.println("Addition of two doubles: "
                + calc.add(10.5, 20.5));
    }
}
// this shows Compile-time polymorphism where multiple methods have the same name but different parameters.