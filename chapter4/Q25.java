package chapter4;

public class Q25 {

    static public class Sample {

        public Sample(){
            System.out.println("A");
            this("B");//thisを使って別のコンストラクタを呼び出す前に、何らかの処理を記述してはならない
        }

        public Sample(String str){
            System.out.println(str);
        }   
        
    }

    public static void main(String[] args) {
        Sample s = new Sample();
    }


}


// javac Q25.java
// java chapter4/Q25