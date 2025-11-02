package chapter2;

public class Q19 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcde");
        sb.reverse();
        sb.replace(1, 3, "a");
        System.out.println(sb);
    }
}

// javac Q19.java
// java chapter2/Q19