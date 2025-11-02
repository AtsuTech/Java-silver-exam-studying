package chapter6;

//nullは変数が何も参照しないことを表現する

public class Q16 {
    public static void main(String[] args) {
        String str = null;

        //nullに対してメソッドを呼び出そうとすると、NullPointerExceptionがスローされる
        if(str.equals("")){
            System.out.println("blank");
        }else{
            System.out.println("null");
        }
    }
}


// javac Q16.java
// java chapter6/Q16