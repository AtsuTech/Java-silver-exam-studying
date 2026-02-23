package playground;

public class ArrayTazigen {
    public static void main(String[] args) {
        int [][] array = new int[3][];
        
        array[0] = new int[2];
        array[2] = new int[3];

        array[0][1] = 1;
        array[2][0] = 6;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


// javac playground/ArrayTazigen.java
// java playground/ArrayTazigen