package chapter2;

public class Q16 {
    public static void main(String[] args){
        String str = "abcde";
        // startsWith()は文字列が引数で指定された文字で始まるかどうか調べるためのメソッド
        System.out.println(str.substring(1,3).startsWith("b"));

        String str2 = "abcde";
        System.out.println(str2.substring(1,3).startsWith("x"));

    }
}


// java chapter2/Q16