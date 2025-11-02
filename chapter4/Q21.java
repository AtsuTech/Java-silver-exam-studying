package chapter4;


public class Q21 {
    
    //クラス
    public static class Sample{

        //コンストラクタ
        Sample(){
            System.out.println("A");
        }

        //ここが初期子にあたる。{}が初期化子。
        {
            System.out.println("B");
        }

        //【重要】初期子はコンストラクらの前に実行される

    }

    public static void main(String[] args) {
        Sample s = new Sample();
    }

}



// javac Q21.java
// java chapter4/Q21