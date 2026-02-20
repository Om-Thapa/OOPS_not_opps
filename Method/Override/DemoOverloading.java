class Display {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(double a) {
        System.out.println("Double: " + a);
    }
}

public class DemoOverloading {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(5);
        d.show(5.5);
    }
}