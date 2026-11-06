class Employee {

    double calculatePay() {
        return 20000;
    }
}

class FullTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 30000 + 5000;
    }
}

class PartTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 10000 + 2000;
    }
}

public class calculator_using_methord_overriding{
    public static void main(String[] args) {

        // Base class reference
        Employee emp;

        // Reference to FullTimeEmployee object
        emp = new FullTimeEmployee();
        System.out.println("Full-Time Employee Pay: "
                + emp.calculatePay());

        // Reference to PartTimeEmployee object
        emp = new PartTimeEmployee();
        System.out.println("Part-Time Employee Pay: "
                + emp.calculatePay());
    }
}
