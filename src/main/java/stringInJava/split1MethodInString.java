package stringInJava;

public class split1MethodInString {
    public static void main(String[] args) {
        String str="AUTOMATION TESTING JOB";
        String [] arr=str.split(" ");
        int len= arr.length;
        for (int i = len-1; i >=0; i--) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
}
