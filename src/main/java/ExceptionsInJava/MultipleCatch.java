package ExceptionsInJava;

public class MultipleCatch {
    public static void main(String[] args) {
    try{
        System.out.println(10/0);
    }catch (ArithmeticException ae){
        System.out.println("Inside Arithmetic Exception block");
    }catch(Exception e) {
        System.out.println("inside Exception Block");
    }
    }
}
