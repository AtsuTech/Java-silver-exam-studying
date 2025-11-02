package chapter4;


public class Q20 {
    
    public static class Sample{

        //これはコンストラクタではない.メソッドである
        void Sample(){
            System.out.println("hello.");
        }

        //コンストラクタが存在しない場合は、”デフォルトコンストラクタ"が自動生成される。
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.Sample();
    }
}


// javac Q20.java
// java chapter4/Q20