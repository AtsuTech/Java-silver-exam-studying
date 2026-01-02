package chapter8;

public abstract class Q5 {
    public static void main(String[] args) {
        try{
            test(null);
        }catch(IllegalStateException e){
            System.out.println("A");
        }catch(RuntimeException e){
            //NullPointerExceptionはRuntimeExceptionのサブクラス
            System.out.println("B");
        }catch(Exception e){
            System.out.println("C");
        }
    }

    private static void test(String str){
        //----equalsIgnoreCaseメソッド---------
        //文字列が一致するかどうかを確認する場合、大文字・小文字を区別したい場合と無視したい場合
        //nullを渡すとNullPointerExceptionがスロー
        //------------------------------------
        if(str.equalsIgnoreCase("")){
            throw new IllegalStateException();
        }
    }
}


// javac chapter8/Q5.java
// java chapter8/Q5