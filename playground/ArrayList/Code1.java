package playground.ArrayList;

import java.util.ArrayList;

public class Code1 {
    public static void main(String[] args) {
        //ArrayList<int> nums = new ArrayList<int>(3);
        ArrayList<Integer> nums = new ArrayList<Integer>(3);
        nums.add(1);
        nums.add(2);
        nums.add(3);
 
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        System.out.println(sum);
    }
}


// java playground/ArrayList/Code1.java