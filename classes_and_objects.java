
class Student {
    int rollNumber;
    String name;
    int english, maths, science;

    Student(int rollNumber, String name,
            int english, int maths, int science) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.english = english;
        this.maths = maths;
        this.science = science;
    }

    int calculateTotal() {
        return english + maths + science;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("english: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("science: " + science);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}


public class classes_and_objects {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", 85, 90, 80);
        Student s2 = new Student(102, "Aman", 75, 88, 92);
        Student s3 = new Student(103, "Priya", 95, 91, 89);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
