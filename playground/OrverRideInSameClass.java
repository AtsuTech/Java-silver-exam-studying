package playground;

public class OrverRideInSameClass {



    public int test(int a ,int b){
        return a * b;
    }

    //同じクラス内で関数をオーバーライドすることはできない
    // public test(int a ,int b){
    //     return a * b;
    // }

    //同じクラス内でオーバーロードは可能
    public String test(String a ,long b){
        return "overload";
    }
}


// javac playground/OrverRideInSameClass.java
// java playground/OrverRideInSameClass