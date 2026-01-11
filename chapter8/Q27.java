package chapter8;

public class Q27 {
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = new B();
        B b2 = new B(20);
        A a2 = new B(10);

        b1.print();
        b2.print();
        a1.print();
        a2.print();


        //確認
        // System.out.println(b1.value);
        // System.out.println(a1.value);
        // System.out.println(b2.value);
        // System.out.println(a2.value);
        // b1.print();
        // b2.print(20);
        // a1.print();
        // a2.print(10);
    }


}



    abstract class A{
        int value;
        public A(){
            this.value = 100;
        }
        public A(int value){
            this.value = value;
        }
        public void print(){
            System.out.println("result=" + value);
        }
        abstract void print(int value);
    }

    class B extends A {
        int value;
        public B(){
            this.value = 200;
        }
        public B (int value){
            this.value = value;
        }
        @Override
        public void print(int value){
            System.out.println("result=" + value);
        }
    }


// javac chapter8/Q27.java
// java chapter8/Q27




//-----------------ポイント-----------------------
// インスタンスを代入した変数で呼び出されているのは、引数なしのpitnt()関数
//　Bには引数なしのpitnt()関数が存在しないので、Aの引数なしのpitnt()関数が呼び出されることになる
