import java.util.Scanner;
public class print{
  public  static void main(String[] args){
    System.out.println("Welcome");
    System.out.println("Hi prakash \n");
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the FirstValue \n");
    int FirstValue =obj.nextInt();
    System.out.println("Enter the SecondValue");
    int SecondValue=obj.nextInt();
    int Add =FirstValue+SecondValue;
    System.out.println("Add = "+Add );
    System.out.printf( "FirstValue + SecondValue = %d ",Add);
  }
}




 