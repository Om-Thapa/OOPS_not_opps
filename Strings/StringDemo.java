class Str {
    void strFunctions() {
        String s = "Java";
        System.out.println(s.length()); // 4

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.charAt(2)); // v

        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1.equals(s2)); // true

        System.out.println(s1.equalsIgnoreCase(s2)); // true

        s1 = "Apple";
        s2 = "Banana";
        System.out.println(s1.compareTo(s2));

        s = "Java Programming";
        System.out.println(s.contains("Java")); // true

        System.out.println(s.substring(3));
        System.out.println(s.substring(0, 4));

        System.out.println(s.replace('a', 'o'));

        s = " Hello ";
        System.out.println(s.trim());

        System.out.println(s.indexOf("P"));

        s = "Java,Python,C++";
        String[] arr = s.split(",");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}

public class StringDemo {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Character at 2: " + s.charAt(2));
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Contains Java: " + s.contains("Java"));
        System.out.println("Index of P: " + s.indexOf('P'));
    }
}