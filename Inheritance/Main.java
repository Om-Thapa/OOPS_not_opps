import java.util.Scanner;

class Person {
    String name;
    int uid;
    String address;
    String dateOfBirth;
    
    Person() {
        name = "";
        uid = 0;
        address = "";
        dateOfBirth = "";
    }

    Person(String name, int uid, String address, String dateOfBirth) {
        this.name = name;
        this.uid = uid;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    void displayInfo() {
        System.out.println("\nBasic Person Info:");
        System.out.println("Name: " + name);
        System.out.println("UID: " + uid);
    }

    void displayAllInfo() {
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    // Method to change address
    void changeAddress(String newAddress) {
        this.address = newAddress;
    }
}

class Student extends Person {
    int rollNumber;
    String course;
    int semester;

    Student(String name, int uid, String address, String dateOfBirth,
            int rollNumber, String course, int semester) {

        super(name, uid, address, dateOfBirth);
        this.rollNumber = rollNumber;
        this.course = course;
        this.semester = semester;
    }

    void displayStudentInfo() {
        displayInfo();
        displayAllInfo();
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter UID: ");
            int uid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Date of Birth: ");
            String dob = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Semester: ");
            int semester = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, uid, address, dob,
                    rollNumber, course, semester);
        }

        // Change address by name
        System.out.print("\nEnter name of student to change address: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (students[i].name.equalsIgnoreCase(searchName)) {

                System.out.print("Enter new address: ");
                String newAddress = sc.nextLine();

                students[i].changeAddress(newAddress);
                found = true;
                System.out.println("Address updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].displayStudentInfo();
        }

        sc.close();
    }
}