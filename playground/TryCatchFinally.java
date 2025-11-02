package playground;

public class TryCatchFinally {
        public static void main(String[] args) {
        System.out.println(test("this is text"));
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








// javac TryCatchFinally.java
// java playground/TryCatchFinally