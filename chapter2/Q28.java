package chapter2;

public class Q28 {

    public static void main(String[] args) {

        //カッコはデータ型の後ろ、変数名の後ろどちらでもOK
        int[] a;
        int b[];


        //多次元配列の場合、次元の数分カッコをつける。カッコはデータ型の後ろ、変数名の後ろどちらでもOK
        int[][] c;
        int d[][];

        //★ 多次元配列の場合、カッコの数をデータ型と変数名で分割してもいい
        int[] e[]; //２次元配列    = int[][] e[][]];
        int[][] f[]; //3次元配列  =int[][][] f[][][]
    }
}

//javac Q28.java
//java chapter2/Q28
