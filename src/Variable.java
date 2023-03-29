public class Variable {
    // STATIC VARIABLE
    static int d = 225;

    //INSTANCE VARIABLE
    int b = 7;

    //METHOD:
    public void display(){
        //local VARIABLE:
        int a =5;
        System.out.println("local variable is:" +a);
        System.out.println("local variable is:" +b);
    }

    //main method:
   public static void main(String[] args) {
        Variable abcd= new Variable();
        abcd.display();
       System.out.println(abcd.b);
       System.out.println(Variable.d);

    }
}
