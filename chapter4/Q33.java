package chapter4;

public class Q33 {
    
    public record Data(String value) {
    }

    public static void main(String[] args) {

        //レコードでは、引数なしのコンスストラクタは仕様できない
        //Data data = new Data();

        Data data = new Data("Sample");
    }
}
