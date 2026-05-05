abstract class Animal {
    // Abstract class with one abstract method and one normal method
    abstract void sound(); // abstract method

    void sleep() { // normal method
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks!");
    }
}

// Abstract class Shape with abstract method area()
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        // Abstract methods enforce implementation in subclass
        Animal d = new Dog();
        d.sound();
        d.sleep();

        Shape c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());

        // Abstract class cannot be instantiated
        // Animal obj = new Animal(); // Error: Animal is abstract; cannot instantiate
    }
}