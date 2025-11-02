package chapter3;

public class Q18 {
    public static void main(String[] args) {
        final int NUM = 0;
        int num = 10;
        switch (num) {
            case "10": System.out.println("A");
                break;
            //case値で使えるものは、定数であること(finalで宣言されたもの)
            case num : System.out.println("B");
                break;
            case 2*5 : System.out.println("C");
                break;
            case NUM : System.out.println("C");
                break;
        }
    }
}
