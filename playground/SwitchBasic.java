package playground;

public class SwitchBasic{
    public static void main(String[] args) {
        int val = 4;
        String out = "initial";
        switch (val) {
            case 1: out = "A";
            case 2: out = "B";
            case 3: out = "C";
            case 4: out = out + "D";
            case 5: out = out + "E";
            default : out.concat("defです");
        }
        System.out.println(out);
    }
}


// javac playground/SwitchBasic.java
// java playground/SwitchBasic