public class FinalKeyword {

    // Demonstrate the use of a final variable
    static void demoFinalVariable() {
        final int x = 10;
        System.out.println("Final variable value: " + x);
        // x = 20; // Error: cannot assign a value to final variable
    }

    // Demonstrate that a final method cannot be overridden
    static class Parent {
        public final void display() {
            System.out.println("Final method in Parent class");
        }
    }

    static class Child extends Parent {
        // public void display() {} // Error: cannot override final method
    }

    // Demonstrate that a final class cannot be inherited
    final static class FinalClass {
        public void show() {
            System.out.println("Inside Final Class");
        }
    }

    // class TryExtend extends FinalClass {} // Error: cannot inherit final class

    static void modifyFinalVariable() {
        final int y = 50;
        System.out.println("Original final variable y: " + y);
        // y = 60; // Error: cannot change value of final variable
    }

    public static void main(String[] args) {
        demoFinalVariable();

        Parent obj = new Parent();
        obj.display();

        FinalClass fc = new FinalClass();
        fc.show();

        modifyFinalVariable();
    }
}