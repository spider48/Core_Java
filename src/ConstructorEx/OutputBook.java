package ConstructorEx;

public class OutputBook {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("math"); // constructor overloading

        book.displaypage();
        book.displaypage("math");   //method overloading
    }
}
