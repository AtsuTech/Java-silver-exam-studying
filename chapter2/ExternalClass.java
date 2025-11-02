package chapter2;

public class ExternalClass {
    public static void main(String[] args) {
        String val1 = "こんにちは";
        System.out.println(val1);
    }

    public int functionA(int arg1, int arg2) {
        // int arg1 = 10;
        // int num2 = 20;
        int proccess = arg1 + arg2 ;
        //System.out.println(proccess);
        return proccess;
    }
}
