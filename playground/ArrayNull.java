package playground;

public class ArrayNull {
    public static void main(String[] args) {
        String[] array = new String[10];
        array[0] = new String("A");
        array[1] = new String("B");
        array[2] = new String("C");

        //nullがあってもエラーは発生しない
        for(String item: array){
            System.out.println(item);
        }
    }
}


// javac playground/ArrayNull.java
// java playground/ArrayNull