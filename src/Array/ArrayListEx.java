package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx {
    public void displayCourses(){
        ArrayList<String> arrayList =new ArrayList<String>();
        System.out.println("before adding: " +arrayList);
        arrayList.add("java");
        arrayList.add("c");
        arrayList.add("c++");
        System.out.println("after adding: " +arrayList);
        System.out.println("the element in the first index is " +arrayList.get(1));
        for (String course: arrayList){
            System.out.println( course);
        }

        arrayList.remove("java");
        System.out.println("after removing" +arrayList);

        arrayList.set(0,"Spring");
        System.out.println("after update: " +arrayList);

        Collections.sort(arrayList);
        System.out.println("After sorting: " +arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("After sort decending order: " +arrayList);

        System.out.println("The size of the array is: " +arrayList.size());

    }

    public void student(){
        ArrayList<Student> students = new ArrayList<>();

        Student student =new Student();
        student.setId(12);
        student.setName("java");

        Student student1 =new Student();
        student1.setId(14);
        student1.setName("c");

        students.add(student);
        students.add(student1);
        System.out.println(students);
    }
}
