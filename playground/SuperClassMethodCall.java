package playground;

public class SuperClassMethodCall {
    
    static public interface FirstInterface {
        default void sp_method(){
            System.out.println("インターフェースのメソッド");
        }
        
    } 

    static public class Sub1 implements FirstInterface {
        public void sub1_method(){
            FirstInterface.super.sp_method();
        }
    }

    static public class Sub2 extends Sub1 {
        public void sub1_method(){
            //2階層以上は呼び出し不可
            FirstInterface.super.sp_method();
        }
    }

    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        sub1.sub1_method();
    }
}


// javac SuperClassMethodCall.java
// java playground/SuperClassMethodCall