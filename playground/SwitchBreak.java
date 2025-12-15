package playground;

public class SwitchBreak {
    public static void main(String[] args) {
        int num = 0;
        int val = 1;
        switch (val) {
            case 1: num++;
            case 2: num++; break;
            case 3: ++num;
            case 4: ++num; break;
            case 5: num++;
            //default: --num;
        }
        System.out.println(num);
    }
}



// javac playground/SwitchBreak.java
// java playground/SwitchBreak