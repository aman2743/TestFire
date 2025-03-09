package DataAbstractionInJava;

abstract class Vehicle1 {
    int no_of_tyres;
    abstract void start();
}

class car extends Vehicle1{
    int no_of_tyres=4;
    public void start(){
        System.out.println("Number of tyres="+no_of_tyres);
        System.out.println("Car starts wit Key");
    }
 }

class scooter extends Vehicle1{
    int no_of_tyres=2;
    public void start(){
        System.out.println("Number of tyres="+no_of_tyres);
        System.out.println("scooter starts wit kick");
    }
}

public class Vehicle{
    public static void main(String[] args) {
        car sc=new car();
        sc.start();
    }
}
