package chapter5;

public class Q6 {

    public static class Q6C implements Q6B {
        @Override
        public void sample(){
            //クラス間の継承で、サブクラスからスーパーメソッドを呼び出す際に使う構文
            //(インターフェース名).super.メソッド名();
            //ただし、2つ以上の実現や階層をまたいでスーパーメソッドを呼び出すことは不可
            Q6B.super.sample();
            System.out.println("Java");
        }
    }

    public static void main(String[] args) {
        Q6A _a = new Q6C();
        _a.sample();
    }
}


// javac Q6.java
// java chapter5/Q6