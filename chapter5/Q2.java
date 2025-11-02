package chapter5;

//継承では、コンストラクタとprivateなフィールドやメソッドを引き継げない

public class Q2 {

    static class A{
        A(String val){

        }
    }

    static public class B extends A{}

    public static void main(String[] args) {
        B b = new B("hello.");
    }
}
