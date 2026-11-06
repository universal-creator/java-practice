class A {
    void display() {
        System.out.println("Class A");
    }
}

class B {
    void display() {
        System.out.println("Class B");
    }
}

// Not allowed in Java
class C extends A, B {  //this will cause error
}