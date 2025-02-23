package stringInJava;

public class charAtMethod1 {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING";
        int len=str.length();
        String str1="";
        for (int i =len-1; i >= 0; i--) {
            char c=str.charAt(i);
             str1=str1+c;
        }
        System.out.println(str1);
    }
}
