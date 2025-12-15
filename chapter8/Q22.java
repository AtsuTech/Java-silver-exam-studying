package chapter8;

public class Q22 {

    public static void main(String[] args) {
        int num = 2;
        while(num < 5){
            switch (num % 2) {
                case 0: ++num;break;
                case 1: num++;
            }
        }
        System.out.println(num);  
    }

}


// javac chapter8/Q22.java
// java chapter8/Q22