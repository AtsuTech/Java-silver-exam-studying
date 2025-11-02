package chapter5;

public class Q9 {

    //抽象クラス
    static abstract class AbstractSample{

        //これは通常のメソッド
        public void sample(){
            System.out.println("A");
            test();//ここで実行されてるのは、サブクラスの"ConcreteSampleクラス"のメソッド
            System.out.println("C");
        }

        //これが抽象メソッド
        //抽象メソッドは実装を持たない。サブクラスでオーバーライドして実装を提供しなければならない
        protected abstract void test();

    }
    

    static class ConcreteSample extends AbstractSample{

        //スーパークラスのメソッドをオーバーライドして実装を提供している
        protected void test(){
            System.out.println("B");//これが実装
        }
    }



    public static void main(String[] args) {
        AbstractSample s = new ConcreteSample();
        s.sample();
    }

}


// javac chapter5/Q9.java
// java chapter5/Q9