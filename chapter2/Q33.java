package chapter2;

//　{}は"初期化子"。インスタンスの生成と同時に値を初期化したい場合に使う

public class Q33 {
    public static void main(String[] args) {

        //これは、初期化子で値を初期化してるのに要素数を指定してるのがNG
        //初期化子が出てきたら、要素数は自動計算される
        //int[] a = new int[]{2,3};ならOK
        int[] a = new int[2]{2,3};

        //初期化子に何も入れない場合、要素数0の配列位スタンスが生成される
        //また、newを使わずに初期化子だけでも記述可能
        int b[][] = {};

        int[][] c = new int[][]{};

        int[]d;
        d = new int[]{2,3};

        //初期化子は変数宣言と同時にしか使うことができない。
        int e[];
        e = {2,3};

    }
}
