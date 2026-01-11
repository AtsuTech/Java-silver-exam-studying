package playground;

class A {

}

public class EqualsMethodCheck{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }
}


// javac playground/EqualsMethodCheck.java
// java playground/EqualsMethodCheck