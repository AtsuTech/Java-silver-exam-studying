package chapter2;

public class Q29 {
    public static void main(String[] args) {
        //配列変数宣言時に、要素の数を指定することはできない
        int[3] a;
        int b[2];
        int[2] c[];
        int d[3][];

        //これはOK
        int[] array = new int[3];
    }
}
