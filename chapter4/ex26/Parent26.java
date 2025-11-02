package chapter4.ex26;

public class Parent26 {
    //設問のコード
    //アクセス修飾子がない場合、同じパッケージに属するクラスでしかアクセスすることができない
    int num = 10;

    //こするといける。publicでアクセス許可し、staticで値を確定？する
    public static int num2 = 10;
}

//コンパイルは、ルートディレクトからでないとうまくいかなかった
//javac chapter4/Q26.java 

//java chapter4/Q26