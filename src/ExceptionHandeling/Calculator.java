package ExceptionHandeling;
import  java.util.Scanner;

public class Calculator {
    public  void calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the next number: ");
        int b = scanner.nextInt();

        try {
            System.out.println("division of the two number is:" + (a / b));
        }catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("cannot divide by zero: ");
        }
        finally {
            System.out.println("it always executes");
        }
    }
    public void display(int age) throws ArithmeticException{

        if(age <20) {
            throw new ArithmeticException("Teenage");
        }else{
            System.out.println("good to go...");
        }
    }
}
