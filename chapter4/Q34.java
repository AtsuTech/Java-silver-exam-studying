package chapter4;

//レコードに宣言できるもの

//コンストラクタ
//メソッド
//staticフィールド
//static初期子
//インナークラスやインナーインターフェース

public class Q34 {
    
    public record Customer(String name,int age,String address){

        //これはエラーになる。staticではないため
        private String val1;

        //staticなフィールドはOK
        static String val2;

        //インナークラス
        public class InnerClass{

        }

        //インナーインターフェース
        public interface InnerInterface {
        
        }


        //メソッド
        void test(){
            System.out.println(name);
        }
    }
}
