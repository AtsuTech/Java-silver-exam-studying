package chapter2;

import java.util.ArrayList;

public class ExpandFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        list.add("G");
        // for(String str : list){
        //     System.out.println(str);
        // }
        for(String str : list){
            if("B".equals(str)){
                list.remove(str);
            }else{
                System.out.println(str);
            }
        }
    }
}


//javac ExpandFor.java
//java chapter2/ExpandFor