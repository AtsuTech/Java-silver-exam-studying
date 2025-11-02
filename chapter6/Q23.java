package chapter6;

public class Q23 {
    
    static public class A implements AutoCloseable{
        @Override
        public void close() throws Exception{
            System.out.println("A");
        }
    }

    static public class B implements AutoCloseable{
        @Override
        public void close() throws Exception{
            System.out.println("B");
        }
    }



    static public class C implements AutoCloseable{
        @Override
        public void close() throws Exception{
            System.out.println("C");
        }
    }


    public static void main(String[] args) throws Exception {
        A a = new A();

        //トライリソースが閉じる順番は、宣言した時と逆の順番
        try(a;
        B b = new B();
        C c = new C()
        ){}
    }


}



// javac Q23.java
// java chapter6/Q23