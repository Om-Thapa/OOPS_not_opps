import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    public String name;
    public String dob; // format: YYYY-MM-DD
    public String id;
    public String address;
    public String gender;
    public double weight; // kg
    public double height; // meters

    public Person(String name, String dob, String id, String address, String gender, double weight, double height) {
        this.name = name;
        this.dob = dob;
        this.id = id;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public void print_info() {
        System.out.println("Name: " + name);
        // System.out.println("DOB: " + dob);
        // System.out.println("ID: " + id);
        // System.out.println("Address: " + address);
        // System.out.println("Gender: " + gender);
        // System.out.println("Weight: " + weight + " kg");
        // System.out.println("Height: " + height + " m");
    }

    public void modify_address(String newAddress) {
        this.address = newAddress;
    }

    public void modify_h_w(double newHeight, double newWeight) {
        this.height = newHeight;
        this.weight = newWeight;
    }

    public void print_age() {
        int birthYear = Integer.parseInt(dob.substring(0, 4));
        int age = LocalDate.now().getYear() - birthYear;
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = Integer.parseInt(sc.nextLine());

        Person[] people = new Person[n];

        int idx = 0;
        while (idx < n) {
            System.out.println("\nPerson " + (idx + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("DOB (YYYY-MM-DD): ");
            String dob = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Weight (kg): ");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.print("Height (m): ");
            double height = Double.parseDouble(sc.nextLine());

            people[idx] = new Person(name, dob, id, address, gender, weight, height);
            idx++;
        }

        System.out.println("\nEntered Persons");
        int j = 0;
        while (j < n) {
            people[j].print_info();
            people[j].print_age();
            System.out.println();
            j++;
        }

        sc.close();
    }
}

