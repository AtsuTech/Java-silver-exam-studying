package chapter6;

public class Q7 {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }

    private static int sample(){
        int val = 0;
        try {
            String[] array = {"A","B","C"};
            System.out.println(array[3]);
        } catch (Exception e) {
            // TODO: handle exception
            val = 10;
            return val;
        }finally{
            val += 10;
        }
        return val;
    }
}


// javac Q7.java
// java chapter6/Q7