package Inheritance.SingleInheritance;

public class Cat extends Animal{

    public Cat(){
        super();
    }
    public  String name ="cat";
    public String child = "This is child class: ";

    public void display(){
        //child class name:
        System.out.println(name);

        //parent class instant variable
        System.out.println(super.name);

        //calls parent class method
        super.animalcolor();
    }
}
