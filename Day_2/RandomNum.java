import java.util.Random;

public class RandomNum{
    public static void main(String[] args) {

     Random rand=new Random();   
     int num=rand.nextInt(10);
     System.out.println(" num " + num);
    }
}