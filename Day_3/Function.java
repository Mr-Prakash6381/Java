
public class Function {

    boolean value = true;

    void greeting() {
        System.out.println("\nWelcome to Function ");
    }

    void NotGreeting() {
        System.out.println("\nNot Welcome to ");
    }

    static void sample(){
        System.out.println("\nThis is Static Function");
    }

    public static void main(String[] args) {
        Function object = new Function();
        sample();

        if (object.value) {
            object.greeting();

        } else {
            object.NotGreeting();
        }
    }

}
