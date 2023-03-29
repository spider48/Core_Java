package ConstructorEx;

public class Book {
    int pageNo =50;

    public Book(){
        System.out.println("this is non - parameterized cons: ");
    }

    public Book(String name){
        System.out.println("Book name is: " + name);
    }

    public  void displaypage(){
        System.out.println("page number is "+ pageNo);
    }

    public  void displaypage(String name){
        System.out.println("page number is "+ pageNo + " Name of the book is " +name);
    }
}
