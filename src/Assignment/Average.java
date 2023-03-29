package Assignment;
import java.util.Scanner;

public class Average {

    public void operation(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        System.out.println("The sum of the numbers are: " +(a+b+c));
        System.out.println("The product of the numbers are: " +(a*b*c));
        System.out.println("The average of the numbers are: "+((a+b+c)/3));

        if(a<b && b<c){
            System.out.println("the smallest number is: " +a);
            System.out.println("The largest number is: " +c);
        } else if (b<a && a<c) {
            System.out.println("The smallest number is: " +b);
            System.out.println("The largest number is: " +c);
        } else if (c<a && a<b) {
            System.out.println("The smallest number is: " +c);
            System.out.println("The largest number is: " +b);
        } else if (c<b && b<a) {
            System.out.println("The smallest number is: " +c);
            System.out.println("The largest number is: " +a);

        }else {
            System.out.println("The smallest number is: " +b);
            System.out.println("The largest number is: " +a);

        }
    }
}
