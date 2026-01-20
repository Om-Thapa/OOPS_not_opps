import java.util.Scanner;

public class Bool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any boolean value : ");
        boolean a = sc.nextBoolean();

        if(a) System.out.println("Value is True");
        if(!a) System.out.println("Value is False");
        System.out.println(a);

        sc.close();
    }
}
