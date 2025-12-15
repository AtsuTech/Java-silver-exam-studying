package chapter5;

public class Q20 {

    static class A{
        public A(){
            System.out.println("A");
        }
    }

    static public class B extends A {
        public B(){
            //super();
            System.out.println("B");
        }
    }

    //サブクラスのコンストラクタが実行される時、
    //スーパークラスのコンストラクタも実行される

    public static void main(String[] args) {
        A a = new B();
        //B a = new B();
    }
}


// javac chapter5/Q20.java
// java chapter5/Q20