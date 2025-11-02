package chapter2;
import java.util.ArrayList;

//拡張for文は、次の要素があった場合のみ一時変数に値を代入して繰り返し処理を実行する

public class Q42 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String str : list){
            if("B".equals(str)){
                list.remove(str);
            }else{
                System.out.println(str);
            }
        }
    }
}


//javac Q42.java
//java chapter2/Q42
