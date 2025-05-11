package ExceptionsInJava;

public class ThrowKeyword2 {
   static ArithmeticException ae=new ArithmeticException("/ by Zero");
    public static void main(String[] args) {
    throw ae;

    }
}
