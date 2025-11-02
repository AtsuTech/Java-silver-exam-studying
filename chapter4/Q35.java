package chapter4;

public class Q35 {

    //レコードでは、getterメソッドがフィールドと同じ名前で自動生成させる
    static public record Data(String value) {

    }

    public static void main(String[] args) {
        

        Data data = new Data("Sample");
        System.out.println(data.value());


        // Data data = new Data();
        // data.value = "sample";
        // System.out.println(data.value());


        // Data data = new Data("Sample");
        // System.out.println(data.value);


        //setterメソッドはレードで自動生成されない
        // Data data = new Data("Sample");
        // data.setValue("test");
        // System.out.println(data.value());

    }




    
}
