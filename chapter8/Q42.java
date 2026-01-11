package chapter8;

class  Sample{

    public void test(Object[] val){
        System.out.println("A");
    }

    public void test(Long[] val){
        System.out.println("B");
    }

    public void test(Object val){
        System.out.println("C");
    }

}

public class Q42 {
    public static void main(String[] args) {
        new Sample().test(new int[3]);

        for(var v: new int[3]){
            System.out.println(v);
        }
    }
}


// javac chapter8/Q42.java
// java chapter8/Q42