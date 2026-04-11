package playground;

public class EX5_16 {
    static int count;
    public void Counter(int count){ this.count = count;}
    public void reset() {count = 0;}
    public static void update(int c){ count += c;}
    public static void main(String[] args) {
        EX5_16 c1 = new EX5_16();
        c1.update(3);
        EX5_16.reset(); //reset()がstaticであればアクセスできる
        System.out.println(EX5_16.count);
    }
}


// javac playground/EX5_16.java
// java playground/EX5_16