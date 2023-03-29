package Encapsulation;

public class OutputStudent {
    public static void main(String[] args) {
        Student student =new Student(54,"java");
        //student.setId(545);
        //student.setName("suman");
        System.out.println("student name is "+student.getName() + " " + "student id is  " +student.getId());

    }
}
