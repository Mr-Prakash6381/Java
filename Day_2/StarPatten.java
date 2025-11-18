
import java.util.Scanner;

public class StarPatten {

    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i = i + 1) {
            System.out.println(" ");
            for (int j = 0; j < num; j++) {

                if (i == 0 && j == 0) {
                    System.out.print(" 0 ");
                } else if (i == 1 && j == 1) {
                    System.out.print(" 0 ");

                } else if (i == 2 && j == 2) {
                    System.out.print(" 0 ");
                } else if (i == 3 && j == 3) {
                    System.out.print(" 0 ");
                } else if (i == 4 && j == 4) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" 1 ");

                }
            }
        }

    }
}
