package playground;

public class ContineInForloop {
    public static void main(String[] args) {
        System.out.println("for文の前です");

        for (int i = 0; i < 3; i++) {
            System.out.println("今は" + i + "です");

            if (i == 1) {
                System.out.println("continueします");
                continue;
            }

            //contineが働いた場合、ここの処理は実行されない
            System.out.println(i + "の処理の終わりです");
        }

        System.out.println("for文の後です");
    }
}


// javac playground/ContineInForloop.java
// java playground/ContineInForloop