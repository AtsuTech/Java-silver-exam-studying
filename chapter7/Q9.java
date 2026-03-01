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

public class SubSample implements Sample {

    // public A execute(int num){
    //     return new B(num);
    // }



    //Objectを戻り値にしたらNGな理由
    //オーバーライドするとき、戻り値は
    //同じ型 か そのサブクラスのみ許可（共変戻り値）
    public Object execute(int num){
        return new A(num);
    }

    // public B execute(int num){
    //     return new A(num);
    // }
    
}

public class Q9 {
    public static void main(String[] args) {
        //new Q6("20").print();
       SubSample s = new SubSample();
        
    }
}


// javac chapter7/Q9.java
// java chapter7/Q9