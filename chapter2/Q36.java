package chapter2;

public class Q36 {
    public static void main(String[] args) {
        int[][] arrayA = { {1,2}, {1,2}, {1,2,3} } ;
        int[][] arrayB = arrayA.clone();
        int total = 0;

        //tmpの型のintに[]を付けているのは、要素が配列だから
        for (int[] tmp: arrayB){
            for(int val: tmp){
                total += val;
            }
        }
        System.out.println(total);
    }
}


//javac chapter2/Q36.java
//java chapter2/Q36
