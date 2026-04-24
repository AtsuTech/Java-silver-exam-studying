package playground.Exception;

public class ExcepInClose {
    public static void main(String[] args) {
        //System.out.println("a");
        try (
            MyResource resource1 = new MyResource("1番");
            MyResource resource2 = new MyResource("2番");
        ) {
            System.out.println("Tryの処理");
        }catch(Exception e){
            System.out.println("例外キャッチ");
        }finally {
            System.out.println("final");
        }
    }
}


class MyResource implements AutoCloseable {
    String name;

    //これは例外が発生するパターンのリソース
    public MyResource(String name) throws Exception {
        this.name = name;
        System.out.println(this.name+"リソース処理");
    }

    //AutoCloseableの抽象メソッドcloseをオーバーライド
    //close()はtryブロック終了後に自動で閉じられる
    public void close() throws Exception{
         System.out.println(name+"closeメソッド処理");
         throw new Exception("closeの中のException");
    }
}


// javac playground/Exception/ExcepInClose.java
// java playground/Exception/ExcepInClose


// -----------実行結果-----------
// 1番リソース処理
// 2番リソース処理
// Tryの処理
// closeメソッド処理
// closeメソッド処理
// 例外キャッチ
// final
//