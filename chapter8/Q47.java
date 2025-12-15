package chapter8;

public class Q47 {
    public static void main(String[] args) {
        int[][] array = new int[2][4];
        array[0] = new int[]{1,2,3,4};
        array[1] = new int[]{1,2};
        for(int[] a : array){
            for(int b : a){
                System.out.println(b);
            }
            System.out.println();
        }

        System.out.println(array[0][2]);
        System.out.println(array[1][1]);
        //System.out.println(array[1][2]);
    }
}


// javac chapter8/Q47.java
// java chapter8/Q47