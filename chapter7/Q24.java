package chapter7;


interface A {
    int a = 1;
    static int b = 2;
    static final int c = 3;
}

public class Q24 implements A {
    public static void main(String[] args) {
        A t = new Q24();

        // int i1 = c++;

        // int i2 = c + a++;

        // int i3 = ++a;

        int i4 = b +1;

    }
}


// javac chapter7/Q24.java
// java chapter7/Q24