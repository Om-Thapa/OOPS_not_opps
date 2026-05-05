class Calculator<T extends Number> {

    T num1, num2;

    // Constructor
    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition
    double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Subtraction
    double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    // Multiplication
    double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Division
    double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }
}

// Main Class
public class GenericCalculator {
    public static void main(String[] args) {

        // Using Integer
        Calculator<Integer> intCalc = new Calculator<>(10, 5);

        System.out.println("Integer Addition: " + intCalc.add());
        System.out.println("Integer Subtraction: " + intCalc.subtract());

        // Using Double
        Calculator<Double> doubleCalc = new Calculator<>(10.5, 2.5);

        System.out.println("Double Multiplication: " + doubleCalc.multiply());
        System.out.println("Double Division: " + doubleCalc.divide());
    }
}