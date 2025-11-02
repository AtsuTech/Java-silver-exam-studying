package chapter3;

public class Q10 {

    //クラス
    public static class Sample{

        private int num;

        //コンストラクタ
        public Sample(int num){
            this.num = num;
        }

        //---本来のequalsメソッド-------//
        // public boolean equals(Object obj){
        //     return (this == obj);
        // }
        //----------------------------//

        //equalsメソッドの引数にObjectdeはなくSampleにしている。これはオーバー"ロード"していることになる
        public boolean equals(Sample obj){
            if(obj == null){
                return false;
            }
            return this.num == obj.num;
        }


    }

    //メイン実行処理
    public static void main(String[] args) {
        //----------------------------------------------------------------------------------------------------------------
        //**「メソッド呼び出し時に渡す引数の型によって、コンパイル時にどのオーバーロードされたメソッドが選ばれるかが決定される」**
        //----------------------------------------------------------------------------------------------------------------

        //インスタンスの返り値をObjectにするかSampleにするかでObjectクラスのequalsメソッドが実行されるのか、もしくはSampleクラスのequalsメソッドが実行されるか変わる
        
        Object a = new Sample(10);
        Object b = new Sample(10);
        // Sample a = new Sample(10); //型をSampleにすると、結果が変わる(コンパイルで選ばれるメソッドが変わる)
        // Sample b = new Sample(10);
        System.out.println(a.equals(b));

    }
}



// javac Q10.java
// java chapter3/Q10