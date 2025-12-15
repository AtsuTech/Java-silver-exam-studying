package chapter8;

public class Q56 {
    public static void main(String[] args) {
        char[][] array1 = {{'a','b'},{'c','d'}};
        char[][] array2 = array1.clone();
        char[] array3 = array1[1].clone();
        //System.out.println(array1[1] == array3);
        //System.out.println(array1[1] == array3[1]);
        System.out.println(array1[1] == array2[1]);
        System.out.println(array1.equals(array2));


        //問題にはない確認
        System.out.println("array1 == array2 is " + (array1 == array2));
        System.out.println(array1[1]);
        System.out.println(array2[1]);

        int ref1 = System.identityHashCode(array1);
        int ref2 = System.identityHashCode(array2);
        int ref3 = System.identityHashCode(array3);
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);


        System.out.println(System.identityHashCode(array1[1]));
        System.out.println(System.identityHashCode(array2[1]));


    }
}


// javac chapter8/Q56.java
// java chapter8/Q56

// java chapter8/Q56.java