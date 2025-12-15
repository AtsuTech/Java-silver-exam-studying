package playground;

public class SwitchBreak2 {
    public static void main(String[] args) {
        int val = 1;

        switch (val) {
            case 1: System.out.println("A"); // breakの後に値を記述
            case 2: System.out.println("B");
            case 3: System.out.println("C");
            case 4: System.out.println("D"); break;
            case 5: System.out.println("E");
            default: System.out.println("X"); // defaultがないとコンパイルエラーになるため追加
        };
    }
}

// javac playground/SwitchBreak2.java
// java playground/SwitchBreak2