package chapter1;

//識別子のルール
//・数字から始めてはいけない
//・使える記号は"_"と"$"のみ
//予約語はつかない

public class Four {
    int $a = 100;
    int b_ = 200;
    int _0 = 300;
    int ${d} = 400;//NG
    int g.a = 700;//NG


    //予約語はつかない
    int void  = 0;
}
