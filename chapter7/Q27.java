package chapter7;

import chapter6.Cp7Sp27;

class B {

    private static B b;

    public static B getInsrance(){
        if(b == null){
            b = new B();
        }
        return b;
    }

    public void hello(){
        //他のパッケージ
        new Cp7Sp27().hello();
    }
}

public class Q27 {
    public static void main(String[] args) {
        B b = B.getInsrance();
        b.hello();
    }
}



// javac chapter7/Q27.java
// java chapter7/Q27