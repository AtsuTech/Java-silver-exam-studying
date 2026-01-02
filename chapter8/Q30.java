package chapter8;

class Sample{
    private String value;
    public void setValue(String value){
        value = "hello" + value;

        //フィールドの変数とローカルの変数の名前が同じ時、フィールドの変数を処理で使う場合はthis.で明示する
        //this.がなければ、ローカルの変数が優先される
        //this.value = "hello" + value;

        //local_value = "hello" + value; //NG
    }
    public String toString(){
        return value;
        //return local_value; //NG
    }
}

public class Q30 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.setValue("Java");
        System.out.println(s.toString());
    }
}


// javac chapter8/Q30.java
// java chapter8/Q30