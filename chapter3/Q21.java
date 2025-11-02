package chapter3;

public class Q21 {
    //"->"を使うと、フォールスルーを避けるためにいちいちbreakを記載する必要がなくなる
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1 -> System.out.println("A");
            case 2 -> System.out.println("B");
            case 3 -> System.out.println("C");
            default -> System.out.println("D");
        }
    }
}


//javac Q21.java
// java chapter3/Q21