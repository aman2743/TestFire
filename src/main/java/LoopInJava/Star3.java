package LoopInJava;

public class Star3 {
    public static void main(String[] args) {
            for (int j = 4; j>=0; j--)
            {
                for (int i = j-1; i>=0 ; i--)
                {
                    System.out.print(" ");
                }
                for (int k=4;k>=j;k--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
