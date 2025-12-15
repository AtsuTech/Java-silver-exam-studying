package chapter7;


// varに関する問題です。
// varは、ローカル変数のデータ型を推論（型推論）するためのもので、以下の箇所では使えません。
// 1.フィールド（インスタンス変数・クラス変数）
// 2. メソッドの引数
// 3.コンストラクタの引数
// 4.メソッドの戻り値の型
// 5. catchブロックのパラメータ
// 6.ラムダ式のパラメータ
// 7. 配列の要素の型

public class Q6 {

    //エラー①
    private var num = 10;//ここでコンパイルエラーになる(しかし、選択肢にはここは指摘されてない)
    //private int num = 10;

    public Q6(String num){
        var var = Integer.parseInt(num);
        this.num = var;
    }

    public void print(){

        //エラー②
        int var = num;//エラー①でエラーになるので、参照している変数numが宣言されていないことになるので、コンパイルエラーにる


        System.out.println(var);
    }

    public static void main(String[] args) {
        new Q6("20").print();
    }
}


// javac chapter7/Q6.java
// java chapter7/Q6