package murasakibook.exam;
import java.util.*;

public class Jenerisc {
    public static void main(String[] args) {
        //ArrayList<Integer> list = Arrays.asList("1","2","3");
        //List<Integer> list = Arrays.asList("1","2","3"); //これはやはりNG ジェネリスクの型(Integer)とString型が不一致
        List<Integer> list = Arrays.asList(1,2,3); //これはOK
        //ArrayList<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list);


        List<Integer> array = List.of(1,2,3);
    }
}


// java murasakibook/exam/Jenerisc.java


// javac murasakibook/exam/Jenerisc.java
// java murasakibook.exam.Jenerisc