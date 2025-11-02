package playground;

// intern()メソッドを使うと、次のような動作をします：
// 「この文字列と同じ内容の文字列が文字列プールにあるかを確認し、あればそれを返す。なければプールに登録して返す」

public class InternMethod {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = new String("apple");
        String s3 = s2.intern();

        System.out.println(s1 == s2); // false（ヒープとプールで違う）
        System.out.println(s1 == s3); // true（どちらもプール）
    }
}
