package InterfaceInJava;
interface Printable{
    public void show();
    private void print(){
        System.out.println("Inside print method");
    }
}

interface DemoTest{

    public void demo();
    private void print(){
        System.out.println("Inside DemoTest method");
    }
}

class A4 implements Printable,DemoTest{

    @Override
    public void show() {
        System.out.println("Inside A4 - show method");
    }


    @Override
    public void demo() {
        System.out.println("Inside A4- Demo");
    }
}

class Letter implements Printable{

    @Override
    public void show() {
        System.out.println("Inside Letter - show method");
    }

}

public class MainClass {
    public static void main(String[] args) {
        A4 obj=new A4();
        obj.show();
        obj.demo();

    }
}
