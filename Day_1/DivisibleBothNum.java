import java.util.Scanner;

public class DivisibleBothNum{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("This is program -- Divisible both number check how may divisible --");
        System.out.println("Enter the Number : \n ");
        int num=scan.nextInt();
        if(num%3==0 && num%5==0  ){
            System.out.println("\nThis is Divisible number");

        }
        else{
             System.out.println("\nThis is not Divisible number");

        }
        

        
    }
}