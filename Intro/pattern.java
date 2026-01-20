public class pattern {
    public static void main(String[] args) {
        // Pattern 1
        System.out.println("Pattern 1\n");
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 2
        System.out.println("Pattern 2\n");
        for(int i=1; i<=5; i++){
            for (int j=5; j>i; j--)
                System.out.print(" ");
            for (int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
