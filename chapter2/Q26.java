package chapter2;

// intern()メソッド
// コンスタントプールを含むメモリ内の文字列を探して再利用するためのメソッド

public class Q26 {
    public static void main(String[] args) {
        
        String a = "abc";
        String b = new String(a);//bは変数aを代入している

        int count = 0;

        if (a.intern() == "abc"){
            ++count;
        }

        if (b.intern() == "abc"){
            ++count;
        }

        if (a.intern() == b.intern()){
            ++count;
        }

        System.out.println(count);

        //おまけ
        System.out.println("オペランド==:" + a == b); //値が同じであっても参照先が違うので”==”で比較した場合は”false”を返します。
        System.out.println("equals():" +a.equals(b));//equalsメソッドで比較した場合は値が同じですので、”true”を返しています。
    }
}

//javac Q26.java
//java chapter2/Q26