
class Person {
    String name = "Sanesh";

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "AIML";

    void showManager() {
        System.out.println("Department: " + department);
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.showName();       
        m.showEmployee();   
        m.showManager();    
    }
}

