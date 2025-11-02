package chapter2;

public class Q30 {
    int a[] = new int[2][3]; //変数の宣言と配列のインスタンスの次元を揃える必要がある
    int[] b = new int[2.3]; //要素数の指定は整数を使用。小数点はNG
    int c[] = new int[2*3];
    int x = 2, y= 3;
    int[] d = new int [x*y];
    int [][] e = new int[2][];
    int f[][] = new int[][3];//1次元目の要素数は省略できない。必ず指定する。

}
