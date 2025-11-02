package chapter6;

public class Q2 {
    public static void main(String[] args) {
        try{
            if(args.length == 0){
                System.out.println("A");
            }
        } catch(NullPointerException e){
            System.out.println("B");
        } finally {
            //finallyは例外発生の有無に関わらず実行される
            System.out.println("C");
        }
    }
}


// javac Q2.java
// java chapter6/Q2