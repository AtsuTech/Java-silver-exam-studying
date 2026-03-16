package playground;

public class ArrayBasic {
    public static void main(String[] args) {
        //int[] a = new int[2][3];
        int[] array0 = {};
        System.out.println("要素数"+array0.length);
        try {
            System.out.println(array0[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("0番目の要素がありません"+e);
        }


        int[] array1 = new int[1];
        System.out.println("要素数"+array1.length);
        System.out.println(array1[0]);

        int[][] array2 = new int[2][3];
        System.out.println(array2.length);
        System.out.println(array2);


        //cp2 Q27
        int[] array3 = new int[0];
        System.out.println(array3);


    }
}


// javac playground/ArrayBasic.java
// java playground/ArrayBasic