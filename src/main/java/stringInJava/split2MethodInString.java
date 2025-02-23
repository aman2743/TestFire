package stringInJava;

public class split2MethodInString {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING JOB";
        String [] arr=str.split(" ");
        int len= arr.length;
        for (int i = 0; i < len; i++) {
            String str1=arr[i];
            int len1=str1.length();
            for (int j = len1-1; j>=0; j--) {
                System.out.print(str1.charAt(j));
            }
            System.out.print(" ");
        }

    }
}
