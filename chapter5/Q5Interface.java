package chapter5;

public interface Q5Interface {
    @Override
    //java.lang.Objectクラスに定義されているメソッド(今回はtoString)はオーバーライドできない
    default String toString() {
        return "A";
    }
}
