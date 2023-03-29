package Array;

public class ArrayEx {

    public void displayArray(){
        int number[] = {1 , 2 , 3 , 4 ,5};

        int sum = 0 ;
 //       for(int i =0; i< number.length; i++){
 //           sum = sum + number[1];
 //           System.out.println(sum);
        for(int n:number){
            sum=sum+n;

        }
        System.out.println(sum);


    }


    public void CourseArray(){
        String[] course = {"java", "c", "c++"};

        for(String i: course){
            System.out.println("Name of the courses are: " +i);
            if(i.equals("c")){
                System.out.println("it contains c");
            }else {
                System.out.println("it doesn't contain c");
            }
        }
        System.out.println(course[1]);


    }

    public void multiDimensional(){
        String[][] sub = {{"java " , "c " , "c++ "}, {"c# " , "js " , "spring "}};
 //       System.out.println(sub[0][1]);
 //       System.out.println(sub[1][2]);
        for(int i =0; i < 2; i++ ){
            for(int j =0;j < 3; j++){
                System.out.println(sub[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayEx arrayEx =new ArrayEx();
//        arrayEx.CourseArray();
//        arrayEx.displayArray();
        arrayEx.multiDimensional();
    }
}
