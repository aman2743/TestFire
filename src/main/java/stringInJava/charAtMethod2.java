package stringInJava;

public class charAtMethod2 {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING";
        int len=str.length();
        String str1="";
        for (int i =0; i < len; i++) {
            char c=str.charAt(i);
             str1=c+str1;
        }
        System.out.println(str1);
    }
}
