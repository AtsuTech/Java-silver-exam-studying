package chapter3;

public abstract class Q27 {
    public static void main(String[] args) {
        int a = 0;
        //whileやdo文は、{}を省略できる
        while (a < 5) 
            //do文で{}を省略した場合do-whileの間には、1文のみしか記載できない
            do
                a++;//複数文を描いてるためNG
                System.out.println(a);
            while (true);
        ;
    }
}


// javac chapter3/Q27.java
// java chapter3/Q27