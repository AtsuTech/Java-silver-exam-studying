package chapter3;

public class Q41 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int total = 0;
        System.out.println(1%2);
        for(int i: array){
            if(i % 2 == 0)
                //continueは残りの繰り返し処理をスキップする
                continue;
            total += i;
        }
        System.out.println(total);
    }
}


// javac Q41.java
// java chapter3/Q41