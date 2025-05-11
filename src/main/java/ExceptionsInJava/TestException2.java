package ExceptionsInJava;

import java.io.FileNotFoundException;

public class TestException2 {
    public static void main(String[] args) {
        try {
            //stmt1
            System.out.println(10/0);
            //stmt3
        } catch (NullPointerException e) {
            //stmt4
        }
       //stmt5
    }
}