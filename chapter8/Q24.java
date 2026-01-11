package chapter8;

public class Q24 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static String test(Object obj){
        String s = "";
        if(obj instanceof String str){
            s = obj.toString();
        }else{
            s = str.toLowerCase();
            //s = new String("互換性なし"); 
        }
        return s;
    }
}


// javac chapter8/Q24.java
// java chapter8/Q24