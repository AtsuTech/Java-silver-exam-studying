package playground;

public class JavaScope {
    int num = 10;
    static void test(){
        int num = 200;
        System.out.println(num);
    }
    public static void main(String[] args) {
        test();
    }
}


// javac JavaScope.java
// java playground/JavaScope