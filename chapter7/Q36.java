package chapter7;

public class Q36 {
    //明示的に値が初期化されていなかればnullで初期化される
    static String str;

    //static String str = "10";
    public static void main(String[] args) {
        //strがnullなので、実行時に例外が例外が発生
        switch (str) {
            case "10": str += "10";
            default: str += "def";
            case "20": str += "20";
        }
        System.out.println(str);
    }
}


// javac chapter7/Q36.java
// java chapter7/Q36