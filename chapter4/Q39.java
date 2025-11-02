package chapter4;

public class Q39 {
    
    public record Data(String value) {

        //下の"Data"のようにレコード名だけで宣言するメソッドを、コンパクトコンストラクタという
        public Data{
            //コンパクトコンストラクタが実行されるタイミングでは、まだフィールドが初期化されていない
            if(this.value == null){
                System.out.println("value is null");
            }
        }

    }

    public static void main(String[] args) {
        Data data = new Data(null);
        System.out.println(data.value());
    }
}
