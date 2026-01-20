import java.util.Scanner;

public class Intro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter SAP ID: ");
        int sapId = sc.nextInt();
        
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("SAP ID: " + sapId);

        if((sapId % 2) == 0) System.out.print("Sap is even");
        else System.out.println("Sap is odd");

        // Get Type of the variable
        System.out.println(name.getClass().getName());
        
        sc.close();
    }
}