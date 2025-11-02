package chapter4;

public class Q28 {

    //class
    static public class Sample{
        //field
        int num;

        //constructor
        public Sample(int num){
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Sample s = new Sample(10);
        modify(s.num);
        System.out.println(s.num);
    }

    public static void modify(int num) {
        num *= 2;
    }
}

// javac Q28.java
// java chapter4/Q28