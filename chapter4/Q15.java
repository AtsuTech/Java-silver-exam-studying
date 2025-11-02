package chapter4;

public class Q15 {
    static public void method(int num) {
        if(num < 0) return;//ifの条件次第でreturnが実行されない場合がある
        System.out.println("A");//returnが必ず実行されるとは限らない場合、到達不能とはならない
        return;
        //System.out.println("B"); //returnの後ろの処理は到達不能→コンパイルラー
    }

    public static void main(String[] args) {
        method(-1);
    }
}



// javac chapter4/Q15.java
// java chapter4/Q15