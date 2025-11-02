package chapter6;

public class Q4 {

    //try-catch-finallyの順番で書かねばならない
    public static void main(String[] args) {
        try{
            Object obj = null;
            System.out.println(obj.toString());
            System.out.println();
        } finally{
            System.out.println("B");
        } catch (NullPointerException e){
            System.out.println("C");
        }
    }
}
