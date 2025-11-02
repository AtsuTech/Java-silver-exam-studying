package chapter3;

public class EaualsMethod {
    

    public static class Sample {
        private int num;
        
        public Sample(int num){
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Sample a = new Sample(100);
        Sample b = new Sample(100);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println(a.equals(b));

        int a_num = a.num;
        int b_num = b.num;
        System.out.println("a:" + a_num);
        System.out.println("b:" + b_num);
        System.out.println(a_num.equals(b_num));
    }
}


// javac EaualsMethod.java
// java chapter3/EaualsMethod