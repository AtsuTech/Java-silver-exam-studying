package chapter1;

public class Five {
    int[][] a = {{1,1},{2,2}};

    short b = (short)'A';

    byte c1 = 10;
    char c2 = c1;

    boolean d = (10 == 10);

    float e = 1.99;//NG floatにはfをつける

    int f = 12_34;

    String g = 'a';//NG シングルクォーテーションで囲んだ場合はchar型

    //Extra
    char castToint = (char)100;//intをcharにキャスト
    String str = "acdsfds:fls";

}
