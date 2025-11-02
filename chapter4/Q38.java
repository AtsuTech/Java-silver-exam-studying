package chapter4;

public class Q38 {
    
    //レコード
    public record Data(String value) {
        public Data(){
            //this();

            //super();

            //this.value = value;

            this("sample");

            //super("sample");
        }


        //thisで初期化するには引数を指定する
        // public Data(String value){
        //     this.value = value;
        // }
    }
}
