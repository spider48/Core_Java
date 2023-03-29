package ControlStatements.DecisionMaking.JumpStatement;

public class JumpEx {
    public void displaybreak(){
        for ( int i =0 ; i < 10; i++){
            if ( i == 5){
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
