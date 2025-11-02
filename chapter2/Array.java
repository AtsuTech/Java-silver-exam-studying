package chapter2;

import java.util.ArrayList;



public class Array {
    int[] a;
    int b[];
    int[][] c;
    int d[][];
    int[] e[];
    int[][] f[];


    //-----------33
    int[] array1 = {2,3};
    int[] array2 = new int[]{2,3};

    //これはエラー
    //int[] arrayx = new int[3]{2,3};

    //-----------44
    var list1 = List.of(1,2,3);
    var list2 = new ArrayList<Integer>();
    var list3 = Array.asList(new Integer[] {1,2,3});
    var list4 = new ArrayList<Integer>(3);


}
