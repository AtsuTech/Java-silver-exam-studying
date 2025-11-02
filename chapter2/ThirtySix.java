package chapter2;

public class ThirtySix {
    public static void main(String[] args){
        int[][] arrayA = {{1,2},{1,2},{1,2,3}};
        //clone()メソッドは、変数の参照先のインスタンスをそのままコピー
        int[][] arrayB = arrayA.clone();
        int total = 0;
        for (int[] tmp: arrayB){
            for(int val :tmp){
                total += val;
            }
        }
        System.out.println(total);
    }
}

//Run : java chaptertwo/ThirtySix
