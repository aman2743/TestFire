package OOPSInJava;

public class MethodInJava {
    int age;
    int sum;
    String name;
    boolean flag;
    public int ageMethod() {
       age=35;
       return age;
    }

    public int sumOfTwoNumbers(int a,int b) {
       sum=a+b;
       return sum;
    }

    public String personName(){
        name="QA";
        return name;
    }

    public boolean booleanMethod(){
        flag=true;
        return flag;
    }

    public static void main(String[] args) {
        MethodInJava obj = new MethodInJava();
    }
}
