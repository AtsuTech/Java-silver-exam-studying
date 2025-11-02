package chapter5;

// 外部ファイルのスーパークラス
// public class Q11SuperClass {
//     protected void hello(){
//         System.out.println("helo");
//     }
// }

public class Q11 extends Q11SuperClass {
    
    //サブクラスでオーバーライドする時につけることができるアクセス修飾子は、スーパークラスで定義されたものと同レベルか緩いものだけ
    @Override
    public void hello() {
        super.hello();
    }

}
