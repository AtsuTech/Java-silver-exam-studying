package chapter6;

//このコードは、StackOverflowErrorを出す
public class Q17 {
    public static void main(String[] args) {
        //このコードは、同じメソッドを呼び続け無限ループのような状態になってる
        main(args);
    }
}


// javac Q17.java
// java chapter6/Q17