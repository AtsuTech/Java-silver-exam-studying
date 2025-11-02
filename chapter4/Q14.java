package chapter4;

public class Q14 {
    
    //低数が空(無し)でもvoidは書かないこと
    void method(void){}

    //可変長引数の宣言の...は型の後ろにかく
    void method(int values...){}

    //可変長引数以外の引数を受け取る場合は、可変長引数を最後にかかkなければならない
    void method(int... values, String name){}

    //可変長引数以外の引数を受け取る場合は、可変長引数を最後にかかkなければならない
    void method(int... a, int... b){}

}
