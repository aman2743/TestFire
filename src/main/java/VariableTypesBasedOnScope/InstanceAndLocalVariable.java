package VariableTypesBasedOnScope;

class TestNew{
    public void m1(){
        int x=20;//local Variable
        System.out.println("Value of x="+x);
    }
    public void m2(){
        int x=30;
        System.out.println("Value of x="+x);
    }
}

public class InstanceAndLocalVariable {
    public static void main(String[] args) {
        TestNew obj=new TestNew();//Created the object of TestNew Class
        obj.m1();
        obj.m2();
    }
}
