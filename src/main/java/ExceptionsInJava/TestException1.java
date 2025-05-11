package ExceptionsInJava;

public class TestException1 {
    public static void main(String[] args) {
        System.out.println("First");
        try {
            System.out.println(10/0);

        } catch(ArithmeticException ae){
            System.out.println("Second");
            System.out.println(10/2);

        }

        System.out.println("Third");
    }
}
