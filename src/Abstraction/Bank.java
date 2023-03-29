package Abstraction;

public abstract class Bank {

    public Bank(){
        System.out.println("parents constructor");
    }
    public abstract int getRateOfInterest();

    public void display(){
        System.out.println("This is bank: ");
    }

    public static void displayBankName(){
        System.out.println("This is Head bank: ");
    }
}
