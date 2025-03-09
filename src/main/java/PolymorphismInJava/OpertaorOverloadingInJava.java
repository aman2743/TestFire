package PolymorphismInJava;


public class OpertaorOverloadingInJava {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        String str1 = "Hello";
        String str2 = "World";

        // Arithmetic addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum); // Output: Sum: 30

        // String concatenation
        String combined = str1 + " " + str2;
        System.out.println("Combined: " + combined); // Output: Combined: Hello World

        // String concatenation with a number
        String mixed = "The number is: " + num1;
        System.out.println("Mixed: " + mixed); // Output: Mixed: The number is: 10
    }
}