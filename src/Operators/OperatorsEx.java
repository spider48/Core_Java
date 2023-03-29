package Operators;
import java.util.Scanner;

public class OperatorsEx {

    public void arthematicOperators() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number: ");
        int a = scanner.nextInt();

        System.out.println("enter second number");
        int b = scanner.nextInt();

        int c = a + b;
        System.out.println("Sum of the numbers are: " + c);

    }

    public void displayName() {
        Scanner bc = new Scanner(System.in);

        System.out.println("enter your name: ");
        String c = bc.nextLine();

        if (c.equalsIgnoreCase("suman")) {
            System.out.println("your name is " + c);
        } else {
            System.out.println(" cannot find your name " + c);
        }
    }


    public void operator() {
            int mathmarks=60;
            int sciencemarks = 60;

            if(mathmarks > 50 && sciencemarks > 50){
                System.out.println("A");
            } else if (mathmarks > 30 && sciencemarks > 30) {
                System.out.println("Excellent");
            } else {
                System.out.println("fail");
            }
        }

    public void switchMarks(){
        int marks =40;

        switch (marks){
            case 20:
                System.out.println("D");
                break;
            case 10:
                System.out.println("F");
                break;
            case 40:
                System.out.println("A");
                break;
            default:
                System.out.println("cannot find marks:");
        }
    }
}


