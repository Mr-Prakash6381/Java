
import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Name ");
        String Name=scan.nextLine();
        System.out.print("Enter Score \n");
        double Score=scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the Department");
        String dept=scan.nextLine();
        System.out.println("\n"+Name);
        System.out.println(Score/10 + "/10");
        System.out.println(dept);

    }

}
