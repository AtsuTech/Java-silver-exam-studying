package chapter4;

public class Q4 {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = a;
        a = null;
        b = null;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


// javac Q4.java
// java chapter4/Q4