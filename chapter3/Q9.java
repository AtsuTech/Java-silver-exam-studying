package chapter3;

public class Q9 {
    
    //クラス
    public static class Sample{

        private int num;
        private String name;

        //コンストラクタ
        public Sample(int num,String name){
            this.num = num;
            this.name = name;
        }

        //ここはオーバーライドしている。アノテーション@Overrideは省略可能
        public boolean equals(Object obj){
            if(obj == null){
                return false;
            }
            if(obj instanceof Sample){
                Sample s = (Sample) obj;
                return s.num == this.num;
            }
            return false;
        }
    }

    //メインの実行部分
    public static void main(String[] args){
        Sample a = new Sample(10,"a");
        Sample b = new Sample(10,"b");
        System.out.println(a.equals(b));
    }
}
