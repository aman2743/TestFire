package DataAbstractionInJava;

abstract class TestAbstract{

    public void TestAbstract(){//Normal Constructor
        System.out.println("Inside constructor");
    }

    public abstract void Display();//Unimplemented Method

    public abstract void print();

    public static void show(){
        System.out.println("Inside show method");
    }
    public final void cal(){
        System.out.println("inside Test - > cal method");
    }

}


