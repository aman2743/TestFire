package jumpStatement;

public class PrimeNumberInJava1 {
    public static void main(String[] args) {
        int num=2000;
        boolean b = false;
        System.out.println("Number 1 and 2 are prime Number");
        for (int i = 3; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = true;
                    break;
                }
            }
            if (b == true) {
                System.out.println("Not a Prime Number="+i);
                b=false;
            } else {
                System.out.println("Prime Number="+i);
            }
        }
    }
}