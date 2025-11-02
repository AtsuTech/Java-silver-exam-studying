package chapter7;

public class Q59 {
    public static void main(String[] args) {
        String[][] array =  new String[2][2];
        array[0][0] = "a";
        array[0][1] = "b";
        array[1][0] = "c";
        array[1][1] = "d";


        //---[C]---
        // for (int i = 0; i < 2; ++i){
        //     for (int j = 0; j < i; ++j){
        //         System.out.println(i);
        //         System.out.println(j);
        //         System.out.println(array[i][j]);
        //     }
        // }


        for(int i = 0; i < 2;){
            for(int j = 0; j < 2;){
                System.out.println(array[i][j]);
                j++;
            }
            i++;
        }
    }
}



// javac chapter7/Q59.java
// java chapter7/Q59