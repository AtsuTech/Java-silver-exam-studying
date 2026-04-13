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
            //System.out.println("catch-retur以外の処理");
            return 0;
        }finally{
            //System.out.println("finally-retur以外の処理");
            return 20;
        }
        
    }
}


// javac chapter6/Q6.java
// java chapter6/Q6