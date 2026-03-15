package chapter7;

public class Q36EX {
    //明示的に値が初期化されていなかればnullで初期化される
    static String str;

    public static void main(String[] args) {
        //例外をキャッチできるようにアレンジ
        try{
            switch (str) {
                case "10": str += "10";
                default: str += "def";
                case "20": str += "20";
            }
            System.out.println(str);
        }catch(NullPointerException e){
            System.out.println("例外をキャッチ。条件にnullが与えられました"+e);
        }

    }
}


// javac chapter7/Q36EX.java
// java chapter7/Q36EX