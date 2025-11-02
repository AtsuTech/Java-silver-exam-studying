package chapter2;

public class Ten {
    public static void main(String[] args){
        String str = "hoge world";
        hello(str);
        System.out.print(str);
    }

    private static void hello(String msg){
        msg.replaceAll("hoge","こんにちは");
    }
}
