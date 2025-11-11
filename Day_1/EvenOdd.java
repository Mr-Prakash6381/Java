import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("\nThis is Program Even or Odd find number --");
        System.out.println("\nEnter the value :\n ");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("\nThis is Even Number");
        }
        else{
            System.out.println("\nThis is Odd Number");
        }




        
    }
}