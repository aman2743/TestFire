package VariableTypesBasedOnScope;
public class StaticVariableInJava {
    int a=45;//instance variable
    static int b=20;//static variable

    public void m1(){
        int z=30;//local variable
        System.out.println(z);
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("inside static method");

    }

    public static void main(String[] str) {
        StaticVariableInJava obj=new StaticVariableInJava();//Created the object of the Class
        System.out.println(b);
        obj.m1();
        System.out.println(obj.a);
        staticMethod();
    }
}
