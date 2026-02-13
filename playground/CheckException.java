package playground;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckException {
     public static void main(String[] args) {

        //try-catchで補足しなければコンパイルエラー
        //FileNotFoundExceptionはチェック例外なので、try-catchする必要がある
        FileReader fr = new FileReader("test.txt"); // ❌ コンパイルエラー
        
        //try-catchすれば、コンパイルエラーとならない
        try {
            FileReader fr = new FileReader("test.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つからないので例外発生");
        }
    }
}
