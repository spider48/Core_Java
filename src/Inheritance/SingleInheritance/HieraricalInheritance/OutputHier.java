package Inheritance.SingleInheritance.HieraricalInheritance;

public class OutputHier {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Truck truck = new Truck();
        System.out.println(bike.b);
        bike.vcolor();
        truck.vcolor();
    }
}
