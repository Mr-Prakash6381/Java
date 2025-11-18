
import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        System.out.println("This is program while loop ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i=0,j=0;
        while (i < num) {
          
            while(j<=i){
                System.out.print(" j= "+ j);
                j++;
            }
              System.out.println(" i= " + i);
            i++;

        }

    }
}
 