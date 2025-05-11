package keywordsInJava;
class ThisDemo{

    ThisDemo(){
        this(10,20);
        System.out.println("Default Constructor");
    }

    ThisDemo(int a){
        System.out.println("Parameterized Constructor");
    }

    ThisDemo(int a,int b){
        System.out.println("Parameterized Constructor with 2 parameters");
    }


}
public class thisKeyword2 {
    public static void main(String[] args) {
        ThisDemo t=new ThisDemo();
    }
}
