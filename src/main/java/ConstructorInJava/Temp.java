package ConstructorInJava;

public class Temp {
    Temp(){
        this(5);
        System.out.println("Default Constructor");
    }

    Temp(int x){
        this(5,15);
        System.out.println("Constructor with one argument");
    }

    Temp(int x,int y){
        int z=x+y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Temp obj=new Temp();
    }
}
