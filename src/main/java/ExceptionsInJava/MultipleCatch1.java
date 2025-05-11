package ExceptionsInJava;

public class MultipleCatch1 {
    public static void main(String[] args) {
    try{
        int a=9;
        int b=1;
        String str=null;
        System.out.println(a/b);
        System.out.println(str.length());
        System.out.println("hello");

    }catch (ArithmeticException ae){
        ae.printStackTrace();
    }catch(NullPointerException ne) {
       ne.printStackTrace();
    }catch(Exception e) {
        System.out.println("inside Exception Block");
    }finally {
        System.out.println("Inside Finally block");
    }
    }
}
