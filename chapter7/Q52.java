package chapter7;

public class Q52 {

    static public class Sample{

        String name;
        int num;

        //コンストラクタが明示的に書かれている場合は、デフォルトコンストラクタは自動で追加されない
        public Sample(String name,int num){
            this.name = name;
            this.num = num;
        }
    }

    static class SubSample extends Sample{
        int price;


        //コンパイルする際にここのコンストラクタ内部にsuper()が追加されるが,その際にsuper()には引数が無い。
        //スーパークラスで明示的に引数のあるコンストラクタが定義されているためコンパイルエラーとなる
        public SubSample(int price){
            this.price = price;
        }

        //コンストラクタがオーバーロードされている
        public SubSample(String name,int num,int price){
            super(name, num);
            this(price);
        }
    }

    public static void main(String[] args) {
        
    }
}


// javac Q52.java
// java chapter7/Q52