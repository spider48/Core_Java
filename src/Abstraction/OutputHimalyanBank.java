package Abstraction;

public class OutputHimalyanBank {
    public static void main(String[] args) {
        HimalayanBank himalayanBank = new HimalayanBank();

        // abstract method
        System.out.println(himalayanBank.getRateOfInterest());

        // non-abstract method
        himalayanBank.display();

        //static method
        HimalayanBank.displayBankName();


    }
}
