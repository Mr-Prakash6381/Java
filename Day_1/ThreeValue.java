
import java.util.Scanner;

public class ThreeValue {

    public static void main(String[] args) {
        int d, e;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Value");
        int a = scan.nextInt();
        System.out.println("Enter the Second Value");
        int b = scan.nextInt();
        System.out.println("Enter the Third Value");
        int c = scan.nextInt();
        d = a + b + c;
        e = a * b * c;
        System.out.println("\nAdd the Three Value : " + d);
        System.out.println("\nMultiple the Three Value : " + e);
    }
}
