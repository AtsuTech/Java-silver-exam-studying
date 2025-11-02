package chapter3;

public class Q24 {
    public static void main(String[] args) {
        int a = 2;
        int b = 100;

        int result = switch(a){
            case 1 -> b*2;
            case 2 -> {
                b = b * 3;
                yield b;
            }
            default -> b;
        };
        System.out.println(result);
    }
}


// javac Q24.java
// java chapter3/Q24