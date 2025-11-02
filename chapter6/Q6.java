package chapter6;

public class Q6 {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }

    private static int sample(){
        try{
            throw new RuntimeException();
        }catch(RuntimeException e){
            return 0;
        }finally{
            return 20;
        }
        
    }
}


// javac Q6.java
// java chapter6/Q6