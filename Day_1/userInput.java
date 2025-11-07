import java.util.Scanner;
public class userInput{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name = user.nextLine();
        System.out.println("Enter the Age");
        int Age=user.nextInt();
        System.out.println("\nName = "+Name + "\nAge = " + Age);
    }
    
}

