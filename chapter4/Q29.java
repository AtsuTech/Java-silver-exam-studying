package chapter4;

public class Q29 {
    
    static public class Sample{
        int num;

        public Sample(int num){
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Sample s = new Sample(10);
        modify(s);
        System.out.println(s.num);
    }

    private static void modify(Sample s){
        s.num *= 2;
    }
}


// javac Q29.java
// java chapter4/Q29