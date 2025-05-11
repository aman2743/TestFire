package EncapsulationInJava;

public class Account {
    private double balance;

    public double getBalance(){
        // User will be validated here
        return balance;
    }

    public void PrintBalance(){
        System.out.println(this.balance);
    }
    public void setBalance(double amount){
        // User will be validated here
       this.balance=this.balance+amount;
    }
}
