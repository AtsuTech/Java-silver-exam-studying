package chapter3;

public class Q38 {
    //オリジナルのコード
    public static void main(String[] args) {
        int num = 10;
        do{
            num++;
        }while(++num < 10);
        System.out.println(num);

        answer_c();
        answer_d();
    }

    //C 
    public static void answer_c(){
        int num = 10;
        while (num++ < 10) {
            num++;
        }
        System.out.println("C:" + num);
    }


    //D
    public static void answer_d() {
        int num = 10;
        while(num++ <= 10){
            num++;
            //System.out.println("処理されました");
        }
        System.out.println("D:" + num);
    }
}



// javac Q38.java
// java chapter3/Q38