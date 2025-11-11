import java.util.Scanner;

public class ElseIf{
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("\nThis is program Else if Statement\n");
     System.out.println("Give the Student Mark Pass or Fail\n");
     System.out.println("Enter the Mark : \n");
     int mark=scan.nextInt();
     if(mark>=35 && mark<=40){
        System.out.println("Guest Pass");
     }   
     else if (mark>=40 && mark<=60) {
        System.out.println("Second Class");
         
     }
     else if (mark>=60 && mark<=90) {
        System.out.println("First Class");
         
     }
     else if(mark>=90 && mark<=100){
        System.out.println("Prime Class");
     }
     else if(mark>=100){
        System.out.println("You should give number 0 to 100 agin you try ---");
     }
     else{
        System.out.println("Fail");
     }
    }
}