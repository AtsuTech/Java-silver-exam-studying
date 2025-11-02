package chapter4;

public class Q40 {

    public interface Test {
        //このvalueメソッドは、値を返さない
        default void value(){
            System.out.println("A");
        }
    }

    //レコードはインターフェースを継承可能(クラスは不可)
    public record Data(String value) implements Test {
        //引数がvalueが指定されている。なので、getterとしてvalueという名前で値を返すメソッドが自動生成される
        //Testインターフェースにもvalueという名前で値を返すメソッドが定義されているが、値を返さない内容となっており、getterメソッドのvalueと互換性がないためコンパイルエラーになる
    }

    public static void main(String[] args) {
        Data data = new Data("B");
        System.out.println(data.value());
    }
}
