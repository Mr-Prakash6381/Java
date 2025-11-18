
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("\nThis program Looping conecpt \n");
        System.out.println("Enter the number lessthan 10 ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }

        }
        System.out.println();
        for (int a = 1; a <= num; a++) {

            for (int b = 0; b < a; b++) {
                System.out.print(" * ");

            }
            System.out.println("  ");
        }
        for (int z = 0; z <= num; z++) {
            for (int y = 0; y < z; y++) {
                System.out.print(z%2==0 ? 0:1);
            }
            System.out.println(" ");

        }
         for (int z = 0; z <= num; z++) {
            int temp=(z*2)-1;
            for (int y = 0; y < temp; y++) {
                System.out.print(z%2==0 ? 0:1);
            }
            System.out.println(" ");

        }

    }
}
