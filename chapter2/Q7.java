package chapter2;

//これはコンパイルエラーとなるコード
public class Q7 {
    
    public class Sample {
        //varはローカル変数の宣言でしか使用できない
        //ローカル変数とは、メソッド内の変数？
        private var value;
        public Sample(var value){
            this.value = value;
        }
        public void test(){
            System.out.println(value);
        }        
    }
    
    public static void main(String[] args) {
        Sample s = new Sample("sample");
        s.test();
    }


}

