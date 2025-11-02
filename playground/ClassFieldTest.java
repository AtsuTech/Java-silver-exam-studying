package playground;

public class ClassFieldTest {

    static private class MyClass{
        int num = 100;
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.num);
    }
}

// javac ClassFieldTest.java
// java playground/ClassFieldTest
