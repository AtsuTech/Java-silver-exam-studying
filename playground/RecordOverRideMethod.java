package playground;

public class RecordOverRideMethod {

    public interface Test {
        default String value(){
            return "A";
        }
    }

    //レコードはインターフェースを継承可能(クラスは不可)
    public record Data(String value) implements Test {
        //引数がvalueが指定されている。なので、getterとしてvalueという名前で値を返すメソッドが自動生成される
        //Testインターフェースにもvalueという名前で値を返すメソッドが定義されている.
        //メソッドの返す型が同じで互換性があるためレコードのgettrメソッドでオーバーライド可能
    }

    public static void main(String[] args) {
        Data data = new Data("B");
        System.out.println(data.value());
    }
}









// javac playground/RecordOverRideMethod.java
// java playground/RecordOverRideMethod