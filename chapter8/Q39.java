package chapter8;

public class Q39 {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.0f;
        double c = 20;
        a = b;
        b = a;
        c = b;
        c = a;
    }
}



// javac chapter8/Q39.java
// java chapter8/Q39