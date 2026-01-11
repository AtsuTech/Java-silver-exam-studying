package chapter8;

public class Q4Extra {
    public static void main(String[] args) {
        int n = 0b0110;
        //System.out.println(n);
        System.out.println(check(n));
    }

    static public boolean check(Number n){
        //return (n instanceof Integer i);
        return (n instanceof Long i);
    }
}


// javac chapter8/Q4Extra.java
// java chapter8/Q4Extra