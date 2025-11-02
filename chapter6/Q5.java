package chapter6;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(test(null));
        //System.out.println(test("Hello"));
    }

    private static String test(Object obj){
        try {
            System.out.println(obj.toString());
        } catch (NullPointerException e) {
            // TODO: handle exception
            return "A";
        } finally{
            //finallyは結果に関わらず必ず実行される
            System.out.println("B");
        }
        return "C";
    }
}


// javac chapter6/Q5.java
// java chapter6/Q5