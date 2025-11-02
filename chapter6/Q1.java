package chapter6;

public class Q1 {
    public static void main(String[] args) {
        try{
            int[] array = {};
            array[0] = 10;
            System.out.println("finish");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
    }
}


// javac Q1.java
// java chapter6/Q1