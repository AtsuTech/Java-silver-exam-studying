package playground;
import java.util.ArrayList;

//addメソッドの動きを確認

public class ArrayAdd  {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        //-----0
        arr.add("A");
        //-----1
        arr.add("B");
        //-----2
        arr.add("C");
        //-----3
        arr.add("D");
        //-----4
        arr.add("E");
        //-----5
        arr.add("F");
        //-----6

        //これで3番目(コメント://-----3)のCとDの間にXが追加される
        arr.add(3,"X");

        for(String item: arr){
            System.out.println(item);
        }
    }
}

// javac ArrayAdd.java
// java playground/ArrayAdd