package chapter7;

public class Q60 {
    public static void main(String[] args) {
        String[] str = new String[2];
        int i = 0;

        for(String s: str){
            //nullの変数に対してconncatメソッド使ってるから例外が発生する
            str[i].concat("e"+i);

            //こう書け配列に値を入れることができる
            //str[i]="e"+i;
            i++;
        }

        for(i=0;i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}


// javac chapter7/Q60.java
// java chapter7/Q60