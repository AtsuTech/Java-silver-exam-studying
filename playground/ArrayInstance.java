package playground;
//import java.util.ArrayList;

public class ArrayInstance {

    public static void main(String[] args) {
        int[] arrins = new int[3];
        System.out.println(arrins);


        int[] arrins2 = new int[3];
        //下記のように要素の値をセットしない場合、要素の値はデフォでセットされる
        //型によって、セットされる値はそれぞれ違う。intの場合は0
        // arrins2[0] = 1;
        // arrins2[1] = 453785743;
        System.out.println(arrins2[1]);



        String[] strarr = new String[]{"aaaa","bbbbb"};
        System.out.println(strarr[1]);
    }
    
}


// javac ArrayInstance.java
// java playground/ArrayInstance