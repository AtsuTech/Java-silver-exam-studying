package chapter6;

public class Q15 {
    
    static private class A {

        private int num;
        public A(int num){
            this.num = num;
        }

        public boolean equals(Object obj) {
            A a  = (A) obj;
            return this.num == a.num;

        }
        
    }

    static private class B {

        private int num;
        public B(int num){
            this.num = num;
        }

        public boolean equals(Object obj) {
            B b  = (B) obj;
            return this.num == b.num;

        }
        
    }

    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(10);
        System.out.println(a.equals(b));
    }
}


// javac Q15.java
// java chapter6/Q15