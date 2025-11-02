package chapter4;

public class Q30 {
    
    //class
    static class A {
        public void test(){
            System.out.println("A");
        }
    }

    //class
    static public class B extends A {
        @Override
        public void test(){
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        A[] array = {new A(), new B(), new A(), new B()};
        for(A a: array){
            // instanceofは、==やequals()に続く3つ目の演算子
            // 同一性(==),同値性(equals)と違い同種性を確かめる
            if(a instanceof B b){
                a.test();
            }else{
                //instanceof演算子のパターン変数にはスコープ範囲がある
                //ifの中で使われた場合、ifの中でしか使えず、elseやelse ifでパターン変数(このコードだとb)を使うことができない
                b.test();
            }
        }
    }

}



// javac Q30.java
// java chapter4/Q30