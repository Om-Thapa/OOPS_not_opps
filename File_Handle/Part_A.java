
import java.io.*;

public class Part_A {
    public static void main(String[] args) {

        // Using create file
        try {
            File file = new File("File_1.txt");
            System.out.println("File created: " + file.getName());

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        // Using FileWriter
        try {
            FileWriter writer = new FileWriter("File_2.txt");

            writer.write("Name: Om Thapa\n");
            writer.write("Roll Number: 12345\n");
            writer.write("Course: B.Tech CSE\n");
            writer.write("University: UPES\n");

            writer.close();
            System.out.println("Data written successfully....");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        // Append using BufferedWriter
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("File_3.txt", true));

            writer.write("\nAdditional Info:");
            writer.newLine();
            writer.write("Semester: 5th");
            writer.newLine();
            writer.write("Section: A");

            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        // Using BufferedReader
        // (a) Character by Character
        try {
            BufferedReader reader = new BufferedReader(new FileReader("File_3.txt"));

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        // (b) Line by Line
        try {
            BufferedReader reader = new BufferedReader(new FileReader("File_3.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        // (c) Entire File as Single String
        try {
            BufferedReader reader = new BufferedReader(new FileReader("File_3.txt"));

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            reader.close();
            System.out.println(content.toString());

        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}