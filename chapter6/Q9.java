package chapter6;

public class Q9 {
    public static void main(String[] args) {
        try {
            try {
                String[] array = {"A","B","C"};
                System.out.println(array[3]);
            } catch (Exception e) {
                System.out.println("D");
            } finally{
                System.out.println("E");
            }
        } catch (Exception e) {
            System.out.println("F");
        } finally{
            System.out.println("G");
        }
    }
}

// javac Q9.java
// java chapter6/Q9