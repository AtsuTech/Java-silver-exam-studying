package chapter4;

public class Q23 {

    static public class Sample {

        //メソッド(メソッド名がコンストラクタ名と同じ)
        void Sample(){
            System.out.println("A");
        }

        //コンストラクタ
        Sample(String str){
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        Sample s = new Sample(); //引数がないので、コンパイルエラーになる
    }
}


// javac Q23.java