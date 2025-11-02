package chapter3;

// 拡張for文
// for( データ型 一時変数 : 集合 ){
//     繰り返し処理
// }

public class Q37 {
    public static void main(String[] args) {
        String[] array = {"A", "B", "c"};

        //拡張for文では、一時変数に1つずつ取り出した配列の要素の参照先を格納してる
        for(String str : array){
            str = "D";
            //System.out.println(str);
        }

        //もし書き換えたいならこう書く
        // for (int i = 0; i< array.length; i++){
        //     array[i] = "D";
        // }

        for(String str : array){
            System.out.println(str);
        }
    }
}


// javac Q37.java
// java chapter3/Q37