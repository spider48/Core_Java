package CastingEx;

public class Casting {
    public void wideningcasting(){
        int a= 5;
        System.out.println("Before casting: " + a);

        float b=a;
        System.out.println("After casting:" + b);
    }

    public void Narrowcasting(){
        float f = 5.6f;
        System.out.println("before casting: " +f);

        int a = (int) f;
        System.out.println("after casting:" +a);

    }
}
