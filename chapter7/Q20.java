package chapter7;


record Book(String name){}

public class Q20 {
    public static void main(String[] args) {

        Book a = new Book("A");
        Book b = new Book("B");

        a.name = "C";


        Book c = new Book();


        boolean isEqual = a==b;

        //NG
        String title = a.getName();
        //String title2 = a.name(); //これならOK

        a = null;

        Book c2 = new Book("C");


        String name = a.name();
    }
    
}
