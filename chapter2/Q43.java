package chapter2;
import java.util.ArrayList;

public class Q43 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        for(String str : list){
            if("C".equals(str)){
                list.remove(str);
            }
        }

        //要素を削除後に読むとエラーになる
        for(String str : list){
            System.out.println(str);
        }
    }
}


//javac Q43.java
//java chapter2/Q43
