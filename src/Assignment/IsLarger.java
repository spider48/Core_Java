package Assignment;
import java.util.Scanner;

public class IsLarger {

    public void application(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println(a +" is Larger");
        } else if (b>a){
            System.out.println(b +" is Larger");
        }else {
            System.out.println("These numbers are equal");
        }
    }
}
