package chapter3;

//a += 10 は a = a + 10 と同じ

public class Q1 {
    public static void main(String[] args) {
        int a = 3;
        int b = a += 5;

        //↑はこれと同じことをしている
        // int a = 3;
        // a += 5;
        // int b = a;
        
        System.out.println(a + b);
    }
}
