package chapter6;

import java.util.ArrayList;
import java.util.List;


//-------例外の種類-------
//IndexOutBoundsException : 配列や文字列、コレクションの範囲外
//ArrayIndexOutOfBoundsException : 配列の要素外アクセス
//StringIndexOutOfBoundsException : 文字列の範囲外

public class Q14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.get(0);
    }
}


// javac Q14.java
// java chapter6/Q14