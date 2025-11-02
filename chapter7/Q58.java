package chapter7;

public class Q58 {

    static public class A{

        //コンストラクタ
        protected A(){
            this(2);//thisはオーバーロードしたコンストラクタを呼び出しに行く？
            System.out.println("1");
        }

        //オーバーロードされたコンストラクタ
        protected A(int a){
            System.out.println(a);
        }
    }

    static public class B extends A{

        //コンストラクタ
        B(){
            this(4);
            System.out.println("3");
        }

        //オーバーロードされたコンストラクタ
        B(int b){
             System.out.println(b);
        }
    }

    public static void main(String[] args) {
        B b = new B();
    }
}


// javac chapter7/Q58.java
// java chapter7/Q58