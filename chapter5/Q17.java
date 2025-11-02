package chapter5;

public class Q17 {

    static class A{
        void hello(){
            System.out.println("A");
        }
    }

    static class B extends A{
        void hello(){
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = (B) a;// キャスト式書いた時点ではコンパイルエラーにならない(キャストno互換性のチェックはコンパイラが行うから？)
        b.hello();
    }
}



// javac Q17.java
// java chapter5/Q17