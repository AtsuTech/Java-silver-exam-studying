package chapter3;

public class Q33 {
    public static void main(String[] args) {
        int array[][] = new int[][]{{1,2},{2,3,4}};
        int total = 0;
        
        for (int i =0; i < array.length; i++){
            for(int j = i ; j < array[i].length ; j++){
                System.out.println("innerのループ i:" + i + ",j:" + j);
                total += array[i][j];
            }
            System.out.println("outerのループ" + i +"回目終了");
        }
        System.out.println(total);
    }    
}


// javac Q33.java
// java chapter3/Q33