package chapter2;

public class Q36 {
    public static void main(String[] args) {
        int[][] arrayA = { {1,2}, {1,2}, {1,2,3} } ;
        int[][] arrayB = arrayA.clone();
        int total = 0;
        for (int[] tmp: arrayB){
            for(int val: tmp){
                total += val;
            }
        }
        System.out.println(total);
    }
}


//javac Q36.java
//java chapter2/Q36
