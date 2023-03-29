package ControlStatements.DecisionMaking.LoopStatement;
import java.util.Scanner;

public class LoopEx {

    public void displayForLoop(){
        Scanner value =new Scanner(System.in);

        System.out.println("enter your name: ");
        String b = value.nextLine();
        for(int i = 0; i < 5; i++){
            System.out.println("your name is :" + b);
        }
    }

    public void displayWhileLoop(){
        int i= 1;
        while (i<5){
            System.out.println(i);
            i++;
        }
    }

    public void multiplication(){
        System.out.println("enter a number: ");
        Scanner value =new Scanner(System.in);
        int number = value.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(number+ " * " + i + " = " + number * i);
            i++;
        }

    }

    public void displayDoWhileLoop(){
        System.out.println("enter number:");
        Scanner value = new Scanner(System.in);
        int number = value.nextInt();

        int i = 1;
        do{
            System.out.println(number+ " * " + i + " = " + number * i);
            i++;
        }while (i<=10);
    }
}
