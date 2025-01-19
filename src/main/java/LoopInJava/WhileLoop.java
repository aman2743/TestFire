package LoopInJava;

public class WhileLoop {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
           int n=i%2;
            if (n==0) {
                System.out.println("Number is even and it is :"+i);
            }
            i++;
        }
    }
}
