package chapter5;

public class Q18 {

    //this.フィールド名は、ローカル変数(メソッドの中の変数)ではなくフィールド名を明示的に使うことが可能

    static class Sample {
        private int num;
        public Sample (int num){
            this.num = num;
            setNum(num);
            //num = num;
            //this->num = num;
            //super.setNum(num);
        }
        public int getNum(){
            return num;
        }
        public void setNum(int num){
            this.num = num;
        }
        
    }

    public static void main(String[] args) {
        Sample s = new Sample(10);
        System.out.println(s.getNum());
    }
}
