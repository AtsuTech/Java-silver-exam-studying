package chapter5;

public class Q12 {
    
    static class A{
        String val = "A";
        void print(){
            System.out.println(val);
        }
    }

    static class B extends A {
        String val = "B";

        //もしBクラスでメソッドをオーバーライドしていた場合は、Bのインスタンスでは
        //Bクラスのメソッドが使用される。
        // void print(){
        //     System.out.println(val);
        // }
    }

    public static void main(String[] args) {
        A a = new A();
        A b = new B(); //型をAとしている
        System.out.println(a.val);
        System.out.println(b.val);//型で定義した変数が参照される
        a.print();
        b.print();
    }
}

// javac Q12.java
// java chapter5/Q12