package NonAccessModifier;
import java.util.Scanner;

public class StaticEx {

    public static int cube(int a){
        return a * a * a;
    }

    public static float area() {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the value of l:");
        float l = value.nextFloat();

        System.out.println("Enter the value of b");
        float b = value.nextFloat();

        return l*b;
    }
}
