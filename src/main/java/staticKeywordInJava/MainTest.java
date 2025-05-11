package staticKeywordInJava;
class StaticInJava{
    String name;
    int rollNumber;
    static String collegeName="MPCT";

    StaticInJava(String nm,int rn){
        this.name=nm;
        this.rollNumber=rn;
    }

    public void displayResult(){
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(collegeName);
    }
    public static void staticMethod(){
        System.out.println("inside staticMethod");
    }
}


public class MainTest {
    public static void main(String[] args) {
        System.out.println(StaticInJava.collegeName);
        StaticInJava.staticMethod();
//        StaticInJava std1=new StaticInJava("Deepak",123456);
//        std1.displayResult();
//        StaticInJava std2=new StaticInJava("Sai",123457);
//        std2.displayResult();

    }
}
