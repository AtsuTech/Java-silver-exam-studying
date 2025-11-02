package chapter4;

public class Q5 {

    //Class
    public static class Sample{
        //フィールドnumはstaticで修飾されている
        static int num = 0;
    }

    //main process
    public static void main(String[] args) {
        //staticなフィールドへのアクセス(クラス名).(フィールド名)
        //staticなフィールドは、インスタンスを作らなくても使用できる
        Sample.num = 10;

        //値確認
        System.out.println("Sample.num:" + Sample.num);


        //ここでは、インタンスを生成してstaticなフィールドにアクセスしている
        Sample s = new Sample();
        Sample s2 = new Sample();
        s.num += 10; // s.num += 10 は、コンパイル時に　Sample.num　+= 10　に置き換えられる
        s2.num = 30; // s2.num = 30 は、コンパイル時に　Sample.num　= 30　に置き換えられる


        System.out.println(Sample.num);

        
    }
}


// javac Q5.java
// java chapter4/Q5