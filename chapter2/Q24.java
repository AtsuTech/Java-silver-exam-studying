package chapter2;

public class Q24 {
    public static void main(String[] args) {
        String a = "sample";
        String b = "sample";
        String c = "hoge";

        System.out.println("aの参照先ID: " + System.identityHashCode(a));
        System.out.println("bの参照先ID: " + System.identityHashCode(b));
        System.out.println("cの参照先ID: " + System.identityHashCode(c));


        System.out.println(a == b); //参照先が違うのでfalseになると思いがちだが、コンスタントプールという仕組みで同じ文字列の場合は参照先が使い回しされて同じ参照先になるため
        System.out.println(a.equals(b)); //同じ値かどうかを調べるため、true

        System.out.println(a == c);
        System.out.println(a.equals(c)); 
    }
}



//  javac Q24.java
//  java chapter2/Q24