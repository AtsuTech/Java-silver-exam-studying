package chapter7;

class A{
    public int num;
    public A(int num){
        this.num = num;
    }
}

class B extends A {
    public B(int num){
        super(num);
    }
}

interface Sample {
    A execute(int num);
}

public class Q9 implements Sample {

    public A execute(int num){
        return new B(num);
    }

    // public B execute(int num){
    //     return new A(num);
    // }
    
}


// javac chapter7/Q9.java
// java chapter7/Q9