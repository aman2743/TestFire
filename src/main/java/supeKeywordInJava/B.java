package supeKeywordInJava;

public class B extends A{
    B(){
        super();
    }
    public void superTest(){
        System.out.println(x);
//        System.out.println(super.x);
        super.m1();

    }

    public static void main(String[] args) {
        B obj=new B();
        obj.superTest();
    }
}
