package chapter3;

public class Q19 {
    public static void main(String[] args) {
        int num = 1;
        //breakを省略すると、breakが現れるまでswich文を抜ける。これを”フォールスルー"という
        switch (num) {
            case 1:
            case 2:
            case 3: System.out.println("A");  
            case 4: System.out.println("B");  
            default:
                System.out.println("C");
        }
    }
}


//javac Q19.java
// java chapter3/Q19