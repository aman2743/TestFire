package stringInJava;

public class splitMethodInString {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING JOB";
        String [] arr=str.split(" ");
        int len= arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }

    }
}
