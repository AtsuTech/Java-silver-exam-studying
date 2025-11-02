package chapter2;

public class Q20 {
    public static void main(String[] args) {
        int data = 1;
        switch (data) {
            default: System.out.println("C");
            case 0: System.out.println("A");
                break;
            case 10: System.out.println("B");
                break;
        }
    }
}


// javac Q20.java
// java chapter2/Q20