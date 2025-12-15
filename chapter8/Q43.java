package chapter8;

public class Q43 {
    int num;
    private static void test(){
        num++;
        System.out.println(num);
    }
    public static void main(String[] args) {
        Main.test();
        Main.test();
    }
}


// javac chapter8/Q43.java
// java chapter8/Q43