package chapter7;

public class Q35 {
    public static void main(String[] args) {
        String str = "abcd ef gh";

        int x = str.indexOf("ef");
        //System.out.println(x); //x=5

        str.substring(x + 3);
        //System.out.println(str); //str=abcd ef gh

        x = str.indexOf("ef");
        System.out.println(str + "" + x);
    }
}


// javac Q35.java
// java chapter7/Q35