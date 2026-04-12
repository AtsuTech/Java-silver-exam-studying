package playground.Exception;

class AutoClose{
    public static void main(String[] args) {
        //System.out.println("a");
        try (MyResource2 resource = new MyResource2();) {
            System.out.println("A");
        }catch(Exception e){
            System.out.println("例外");
        }finally {
            System.out.println("B");
        }
    }
}



class MyResource implements AutoCloseable {
    public MyResource(){
         System.out.println("C");
    }

    //AutoCloseableの抽象メソッドcloseをオーバーライド
    //close()はtryブロック終了後に自動で閉じられる
    public void close(){
         System.out.println("D");
    }
}


class MyResource2 implements AutoCloseable {

    //これは例外が発生するパターンのリソース
    public MyResource2() throws Exception {
        System.out.println("C");
        throw new Exception("コンストラクタ例外");
    }

    //AutoCloseableの抽象メソッドcloseをオーバーライド
    //close()はtryブロック終了後に自動で閉じられる
    public void close(){
         System.out.println("D");
    }
}


// javac playground/Exception/AutoClose.java
// java playground/Exception/AutoClose