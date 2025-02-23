package stringInJava;

public class equalsIgnoreCaseMethodInString {
    public static void main(String[] args) {
        String str1=new String("AUTOMATION");
        String str2="Testing";
        String str3=new String("automation");
        boolean b=str1.equalsIgnoreCase(str3);
        System.out.println(b);
    }
}

