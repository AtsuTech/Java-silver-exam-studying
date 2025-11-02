package chapter5;

public class Q21 {

    static class Parent{
        public Parent(){
            System.out.println("A");
        }
        public Parent(String val){
            this();
            System.out.println(val);
        }
    }

    static class Child extends Parent {
        public Child(){
            super("B");//スーパークラスのコンストラクターを先に実行
            System.out.println("C");
        }

        //これは、上のChildをオーバーロードしたコンストラクター
        public Child(String val){
            this();//コンストラクタの中からオーバーロードされた別のコンストラクターを呼び出す
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        new Child("D");
    }

}


// javac Q21.java
// java chapter5/Q21
