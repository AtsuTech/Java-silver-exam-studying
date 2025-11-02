package chapter5;

import javax.swing.plaf.ColorUIResource;

public class Q15 {
    
    static public interface A {}

    static public class B implements A {}
    
    static public class C extends B {}
    
    static public class D {}

    public static void main(String[] args) {
        A[] array = {
            new B(),
            new C(),
            new A(),//インターフェースはインスタンス化できない
            new D()//型に互換性がないので、ポリフォーフィズムが適応できない
        };
    }

}
