package PolymorphismInJava;

class MainMethodOverloadTest{
    public void main(String name){
        System.out.println(name);
    }

    public void main(char c){
        System.out.println(c);
    }
    public void main(int x,int y){
        System.out.println(x+y);
    }
    public void main(){
        System.out.println("inside main method overload without arguments");
    }

}


public class MainMethodOverload {
    public static void main(String[] args) {
        MainMethodOverloadTest obj=new MainMethodOverloadTest();
        obj.main();
    }
}
