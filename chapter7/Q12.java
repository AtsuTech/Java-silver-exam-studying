package chapter7;

public class Q12 {
    
    static abstract class A{
        private int id;
        public A(int id) {
            this.id = id;
        }

        //これは抽象メソッドではない(abstructがつかないから)
        void sample(){
            System.out.println("A");
        }
    }

    public class B extends A{

        //スーパークラスでコンストラクタが、型付きで明示的に宣言されている場合は、
        //サブクラスでスーパークラスのコンストラクタを呼び出す必要がある
        public B(int id){
            super(id);
        }

        public void sample(){
            System.out.println("A");
        }
    }
}


// javac chapter7/Q12.java
// java chapter7/Q12
