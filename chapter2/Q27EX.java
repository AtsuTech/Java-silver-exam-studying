package chapter2;

public class Q27EX {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array);

        array[1] = 1000000;
        for(int val:array){
            System.out.println(val);
        }
    }
}


// javac chapter2/Q27EX.java
// java chapter2/Q27EX