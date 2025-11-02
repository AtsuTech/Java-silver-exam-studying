package chapter7;

public class Q4 {
    public static void main(String[] args) {
        String a = new String("sample");
        String b = a;
        String c = a.intern();
        String d = "sample"; //Stringオブジェクトでは、ダブルクォーてションで囲んだだけでインスタンスが作られる(newしてるのと同じ)

        String e = new String("sample");

        if(a == b){
            System.out.println("A");
        }

        if(a == c){
            System.out.println("B");
        }

        if(a == d){
            System.out.println("C");
        }

        if(b == c){
            System.out.println("D");
        }

        if(b == d){
            System.out.println("E");
        }

        if(c == d){
            System.out.println("F");
        }

        if(a == e){
            System.out.println("a==eです");
        }


        //出力確認
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);


        System.out.println("----------------------------------");


        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


        System.out.println("----------------------------------");


        System.out.println("a="+ System.identityHashCode(a));
        System.out.println("b="+ System.identityHashCode(b));
        System.out.println("c="+ System.identityHashCode(c));
        System.out.println("d="+ System.identityHashCode(d));
    }
}



// javac chapter7/Q4.java
// java chapter7/Q4