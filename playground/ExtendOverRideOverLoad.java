package playground;

class A{
    public void func(String args) {
        System.out.println("Aクラスのメソッド");
    }
}

class B extends A{

    //これはオーバライド
    // public void func(String args) {
    //     System.out.println("Bのオーバーライド");
    // }

    //これはオーバーロード
    public void func(Object args) {
        System.out.println("Bのオーバーロード");
    }
}

public class ExtendOverRideOverLoad {
    public static void main(String[] args) {
        A b1 = new B();
        b1.func("A");

        B b2 = new B();
        b2.func("A");

    }
}


// javac playground/ExtendOverRideOverLoad.java
// java playground/ExtendOverRideOverLoad