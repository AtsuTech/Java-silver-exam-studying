package chapter5;

public class Cast {

    static class A{
        void hello(){
            System.out.println("こんにちは");
        }
    }

    static class B extends A{
        void goodbye(){
            System.out.println("さよなら");
        }
    }

    public static void main(String[] args) {

        //これはNG
        // A a = new A();
        // B b = (B) a;
        // b.goodbye();


        //これはOK
        B b = new B ();
        A a = (A) b;
        a.hello();
    }
}


// javac Cast.java
// java chapter5/Cast