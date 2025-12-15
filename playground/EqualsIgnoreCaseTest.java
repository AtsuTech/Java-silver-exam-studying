package playground;

public class EqualsIgnoreCaseTest {
    public static void main(String[] args) {
        String var = null;
        //equalsIgnoreCaseメソッドは、文字列が一致するかどうか比較判別する場合に、大文字と小文字を区別せずに比較
        System.out.println(var.equalsIgnoreCase(""));
    }
}


// javac playground/EqualsIgnoreCaseTest.java
// java playground/EqualsIgnoreCaseTest