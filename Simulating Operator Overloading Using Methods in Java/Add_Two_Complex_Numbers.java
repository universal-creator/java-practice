
class ComplexNumber {

    double real;
    double imaginary;
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    ComplexNumber add(ComplexNumber c) {
        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Add_Two_Complex_Numbers {
    public static void main(String[] args) {

        // Creating two complex number objects
        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(4, 2);

        // Adding two complex numbers
        ComplexNumber result = c1.add(c2);

        // Displaying results
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum: ");
        result.display();
    }
}
//Operator overloading means giving an operator such as +, -, or * a special meaning for user-defined objects.
//However, Java does not allow programmers to define custom operator overloading for their own classes.