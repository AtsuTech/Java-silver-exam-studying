package chapter3;

public class Q3 {
    public static void main(String[] args){
        int a = 10;
        int b = a++ + a + a-- - a-- + ++a;
        //      11   11   10    9     10　
        System.out.println(b);
    }
}
