package chapter7;

public class Q52EX {

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


        // public SubSample(int price){
        //     this.price = price;
        // }

        //コンストラクタがオーバーロードされている
        public SubSample(String name,int num,int price){
            super(name, num);
            this.price;
        }
    }

    public static void main(String[] args) {
        
    }
}


// javac chapter7/Q52EX.java
// java chapter7/Q52EX