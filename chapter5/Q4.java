package chapter5;

public class Q4 {
    
    static public interface A {
        //インターフェースに実装されたメソッドは、それを実現したクラスが全て実装しなければならない
        //インターフェースはメソッド定義はできるが、メソッドに処理内容を書くことはできない。もし処理を書きたい場合は、"default"をつける
        void sample(){
            System.out.println("Sample");
        }
    }

    public class B implements A{

    }

    public static void main(String[] args) {
        A a = new B();
        a.sample();
    }
}
