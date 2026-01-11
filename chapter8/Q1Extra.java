package chapter8;

class Init{
    int n;
}

public class Q1Extra {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 10;
        System.out.println(a + "," + b + "," + c); //関数の変数初期化しないとエラー
        System.out.println(new Init().n); //クラスは初期化しなくても初期化される
    }
}



// javac chapter8/Q1Extra.java
// java chapter8/Q1Extra
