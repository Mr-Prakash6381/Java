
import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Compare two strings ");
        System.out.println("Enter the First String -- ");
        String firstName = scan.nextLine();
        System.out.println("Again Enter the Second String --");
        String secondName = scan.nextLine();
        if (firstName.equals(secondName)) {
            System.out.println("\n\nThis is equal String");
        } else {
            System.out.println("\n\nThis is not equal String");
        }
        if(firstName.equalsIgnoreCase(secondName)){
            System.out.println("\n\nThis is equal string Ignore CaseSensitve");
        }
        else{
            System.out.println("\n\nThis not equal string Ignore CaseSensitve");
        }

    }
}
