package chapter6;

public class Q12 {
    public static void main(String[] args) {
        try{;
            sample();
        }catch(StackOverflowError e){
            //Errorを例外でキャッチ可能
            System.out.println("StackOverflowErrorが発生");
        }
    }

    public static void sample() {
        sample();
    }
}


// javac chapter6/Q12.java
// java chapter6/Q12