package LoopInJava;

public class Star4 {
    public static void main(String[] args) {
            for (int j = 4; j>=0; j--)
            {
                for (int i = 4; i>=j ; i--)
                {
                    System.out.print(" ");
                }
                for (int k=0;k<=j;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
