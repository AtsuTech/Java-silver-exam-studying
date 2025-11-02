package chapter4;

public class Q11 {
    
    //Class
    public static class Sample{
        private String value;

        //Javaでは、メソッドが何らかの値を返さない場合(returnなし)、その戻り値の型をvoidと宣言する
        public void setValue(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    //main proccss
    public static void main(String[] args) {
        Sample s = new Sample();

        //ここでエラーになる。setValueメソッドは、戻り値がvoideである。voidは、値を返さない型なので、
        //変数valにdetValueの結果を代入するとエラーとなる
        String val = s.setValue("hello");

        s.getValue();
        System.out.println(val);
    }
}
