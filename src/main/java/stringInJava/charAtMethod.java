package stringInJava;

public class charAtMethod {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING";
        int len=str.length();

        for (int i =len-1; i >= 0; i--) {
            char c=str.charAt(i);
            if(c==' '){
                System.out.println();
            }
            else{
                System.out.print(c);
            }

        }

    }
}
