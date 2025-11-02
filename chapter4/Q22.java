package chapter4;


public class Q22 {

    //クラス
    public static class Sample{

        //staticで就職されたクラス変数は、インスタンスを生成しなくても使える変数
        //[重要]インスタンス生成前に、初期化子やコンストラクタで変数の値を初期化できない
        static int num;



        {
            num = 10;
        }

        public Sample(){
            num = 100;
        }       
        
    }

    public static void main(String[] args) {
        System.out.println("インスタンス生成なし:"+Sample.num);

        Sample s = new Sample();//インスタンス生成
        System.out.println("インスタンス生成あり:"+ Sample.num);
    }

}


// javac Q22.java
// java chapter4/Q22