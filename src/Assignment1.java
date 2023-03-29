import java.util.Scanner;

public class Assignment1 {

    public void subjects(){
        Scanner enter = new Scanner(System.in);


        System.out.println("Enter your subject name: ");
        String subname = enter.nextLine();

        System.out.println("Enter your marks on " + subname +" subject: ");
        int submark = enter.nextInt();

        System.out.println(subname+ " : " + submark);

        Scanner enter1 = new Scanner(System.in);



        System.out.println("Enter your next subject name: ");
        String subname1 = enter1.nextLine();

        System.out.println("Enter your marks on " +subname1 +" subject: ");
        int submark1 = enter1.nextInt();

        System.out.println(subname1 + " : " +submark1);


        if(submark < 0 || submark1 < 0) {
                System.out.println("please enter the number greater than 0");
        }else if(submark >= 40 && submark1 >=40){
                System.out.println("you are pass");
            } else if (submark <= 35 && submark1 <= 35) {
                System.out.println("you are almost pass");
            } else if (submark > 100 || submark1 > 100) {
                System.out.println("marks can cannot exceed 100!");
        } else {
                System.out.println("you are fail");
            }
        }


    public static void main(String[] args) {
        Assignment1 output = new Assignment1();
        output.subjects();
    }

}

