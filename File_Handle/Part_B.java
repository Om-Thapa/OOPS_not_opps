import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

public class Part_B {
    public static void main(String[] args) {
        Path path = Paths.get("File_4.txt");

        // Create File Using NIO
        try {
            if (Files.exists(path)) {
                System.out.println("File already exists.");
            } else {
                Files.createFile(path);
                System.out.println("File created using NIO.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write Using NIO
        List<String> data = Arrays.asList(
            "Name: Om Thapa",
            "Course: B.Tech CSE"
        );

        try {
            // WRITE (overwrite)
            Files.write(path, data, StandardOpenOption.WRITE);

            // APPEND
            Files.write(path,
                Arrays.asList("University: XYZ University"),
                StandardOpenOption.APPEND
            );

            System.out.println("Data written using NIO.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read Entire File
        try {
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);

            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read Line by Line
        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read Using Stream API
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}