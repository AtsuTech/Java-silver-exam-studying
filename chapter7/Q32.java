package chapter7;

public class Q32 {
    static int num = 23;
    public static void main(String[] args) {
        //ローカル変数内であれば、インスタンス変数やクラス変数と同目の変数を定義可能
        int num = num; //メソッド内の変数numがこれでは初期化されてないのでNG
        


        //int num = Q32.num;
        System.out.println(num);


        //static変数(クラス変数)の呼び出し: クラス名.num
        //インスタンス変数の呼び出し: this.num


    }


}



// javac chapter7/Q32.java
// java chapter7/Q32