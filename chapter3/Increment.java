package chapter3;

public class Increment {
    public static void main(String[] args) {
        int a = 10;
        //int b = 10;

        System.out.println(a++); 
        System.out.println(a);
        System.out.println(++a);
    }

}

// Run: java chaptert3/Increment

//後置
//自分自身には可算状態が反映されないが、次に変数を使う時、その変数が加算された状態に
