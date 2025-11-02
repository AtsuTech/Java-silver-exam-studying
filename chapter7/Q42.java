package chapter7;

import java.util.Collection;
import java.util.List;

import java.util.ArrayList;

public class Q42 {

    static public class A{
        public void sample(Collection arg) {
            System.out.println("A");
        }
    }

    static public class B extends A {
        //オーバーライド
        public void sample(Collection arg){
            System.out.println("B");
        }

        //ここはオーバーロード
        public void sample(List arg){
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B(); //Aの型で扱っても、BでオーバーライドされたメソッドあればBのメソッドが使われる
        B b1 = new B();

        List<String> list = new ArrayList<>();

        a1.sample(list);
        a2.sample(list);
        b1.sample(list);
        
    }
    
}


// javac chapter7/Q42.java
// java chapter7/Q42