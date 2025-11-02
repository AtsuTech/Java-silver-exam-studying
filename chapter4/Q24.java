package chapter4;


public class Q24 {

    static public class Sample{
        public Sample(){
            //Sample(null,0); //これば別のクラスでインスタンス化する時の書き方なのでNG
            this(null,0);
            
            //super(null,0);
            //this.Sample(null,0);
        }
        public Sample(String str,int num){
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
        Sample s = new Sample();

    }
}



// javac Q24.java
// java chapter4/Q24