package PolymorphismInJava;

class MethodOverloadingInJava {
  public void Sum(int a,int b){
      System.out.println(a+b);
  }

    public void Sum(int a,int b,int c){//Number of arguments differ
        System.out.println(a+b+c);
    }

    public void Sum(float a,float b){//With Different Data Type
        System.out.println(a+b);
    }
}

public class MainC1{
    public static void main(String[] args) {
        MethodOverloadingInJava obj1=new MethodOverloadingInJava();
        obj1.Sum(10,20);
        MethodOverloadingInJava obj2=new MethodOverloadingInJava();
        obj2.Sum(10,20,30);
        MethodOverloadingInJava obj3=new MethodOverloadingInJava();
        obj3.Sum(102.45f,76.14f);

    }
}
