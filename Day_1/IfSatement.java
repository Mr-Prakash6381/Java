
import java.util.Scanner;

public class IfSatement {

    public static void main(String[] args) {
        System.out.println("This program is compare two value : ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = scan.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println("\nA is greathan number");
        } else {
            System.out.println("\nB is greathan number");
        }

    }
}
