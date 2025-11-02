package playground;

public class DownCast {
    
    static public class A {}
    
        
    static public class B extends A {
        public void method_b(){
            System.out.println("Bのメソッドです");
        }
    }
    
        
    public static void main(String[] args) {

        A a = new B();
        B b = (B) a;//ダウンキャストしている(上でアップキャストでインスタンス元の型にしていたのを、元に戻してる)
        b.method_b();
    }
}


// javac DownCast.java
// java playground/DownCast