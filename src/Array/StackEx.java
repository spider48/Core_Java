package Array;
import java.util.Scanner;
import java.util.Stack;

public class StackEx {

    public void StackEg() {
        Scanner scanner =new Scanner(System.in);


        System.out.println("enter the string: ");
        String inputString =scanner.nextLine();

        Stack stack = new Stack();

        for(int i=0 ; i < inputString.length(); i++){
            stack.push(inputString.charAt(i));
        }
        String reverseString="";

        while (!stack.isEmpty()){
            reverseString += stack.pop();
        }
        if(inputString.equals(reverseString)){
            System.out.println("Palindrome ");
        }else {
            System.out.println("Not palindrome ");
        }


    }
}
