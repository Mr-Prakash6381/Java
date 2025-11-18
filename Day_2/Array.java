
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num give array input");
        int user = scan.nextInt();
        int[] num = new int[user];
        int count = 0;
        for (int i = 0; i < user; i++) {
            // num[i]=scan.nextInt();
            num[i] = scan.nextInt();
            count = count + 1;
        }
        System.out.println("Count = " + count);
        for (int j = 0; j < count; j++) {
            System.out.print(num[j]);
        }
        // for (int j = 0; j <= num; j++) {
        //     System.out.print(j);
        // }
        System.out.print("\n\n" + num[0]);
        System.out.print(num[1]);
        System.out.print(num[2]);
        System.out.print(num[3]);
        System.out.print(num[4]);

    }

}  
