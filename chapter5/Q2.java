package chapter5;

//継承では、コンストラクタとprivateなフィールドやメソッドを引き継げない

class A{
    A(String val){

    }
}

public class B extends A{
    
}

public class Q2 {

    public static void main(String[] args) {
        B b = new B("hello.");
    }
}



// javac chapter5/Q2.java
// java chapter5/Q2