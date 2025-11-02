package chapter2;
import java.util.ArrayList;

public class Q39 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add(2,"B");
        list.add("C");
        list.add("D");
        //list.add(2,"X"); //2番目が存在する後に書けばOK
        for(String str : list){
            System.out.println(str);
        }
    }
}

//  javac Q39.java
//  java chapter2/Q39