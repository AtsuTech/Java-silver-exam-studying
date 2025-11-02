package chapter3;

public class Q16 {

    //if文の{}は省略可能
    public static void main(String[] args) {
        int num  = 10;
        if(num == 100)
            System.out.println("A");
        else if(10 < num)
            System.out.println("B");
        else
        if(num == 10)
            System.out.println("C");
        else
        if(num == 10)
        System.out.println("D");


        //基本形
        String str = "A";
        if(str == "A")
            System.out.println("晴れ");
        else if(10 < num)
            System.out.println("雨");
        else
            System.out.println("曇り");
    }
}


// javac Q16.java
// java chapter3/Q16