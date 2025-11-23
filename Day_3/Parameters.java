import java.util.Scanner;

public class Parameters {

    void add(int x, int y) {
        System.out.printf("\nA + B = " +( x + y));
    }
    void sub(int x, int y){
        System.out.println("\nA - B = " + (x-y));
    }

    void multi(int x, int y) {
        System.out.println("A * B = " + x*y);
    }
    void div(int x, int  y){
        System.out.println("A / B = " + x/y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Etner the Two Number Authemtic Operation");
        System.out.println("Enter the First Input Number");
        int a=scan.nextInt();
         System.out.println("Enter the Second Input Number");
        int b=scan.nextInt();
        Parameters Obj=new Parameters();
        Obj.add(a,b);
        Obj.sub(a,b);
        Obj.multi(a, b);
        Obj.div(a, b);

    }
}
