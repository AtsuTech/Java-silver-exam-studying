package chapter2;

public class Q34 {
    public static void main(String[] args) {
        String[][] array = { {"A","B"}, null , {"C","D","E"} };
        //String[][] array = { {"A","B"}, {"X","E","D","Z"} , {"C","D","E"} }; //こう書くと正しく動作する
        int total = 0;
        for(String[] tmp : array){
            total += tmp.length;
        }
        System.out.println(total);
    }
}


//javac Q34.java
//java chapter2/Q34
