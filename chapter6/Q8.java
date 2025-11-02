package chapter6;

public class Q8 {
    public static void main(String[] args) {
        try{
            System.out.println("A");
        }finally{
            System.out.println("B");
        }finally{
            //finallyブロックは1つしか書くことができない
            System.out.println("C");
        }
    }
}
