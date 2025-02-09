package VariableTypesBasedOnScope;

class Test{
    public void method1(){
      int x=20;//local Variable
        System.out.println("Value of x="+x);
    }
    public void method2(){
        int x=30;
        System.out.println("Value of x="+x);
    }
}

public class LocalVariable {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.method1();
        obj.method2();
    }
}
