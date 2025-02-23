package stringInJava;

public class StringUsingNewKeyword {
    public static void main(String[] args) {
        String str1=new String("Welcome");
        String str2=new String("Welcome");
        if(str1==str2){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
        }
}
