package chapter8;

public class Q7 {

    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.data + "," + b.getData() + "|");
        b.data = 20;
        System.out.println(b.data + "," + b.getData() + "|");
        B s = (B) b;
        System.out.println(s.data + "," + s.getData() + "|");
        s.data = 21;
        System.out.println(s.data + "," + s.getData() + "|");
    }
    

    static public class A {
        public int data = 10;
        public int getData(){
            return data;
        }
    }

    static class B extends A {
        int data = 11;
        public int getData(){
            return data;
        }
    }
}


//javac chapter8/Q7.java
//java chapter8/Q7