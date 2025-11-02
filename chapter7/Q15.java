package chapter7;

public class Q15 {
    
    static public class Test{
        private int value;
        public Test(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        
        String s = "A";
        String t = new String("A");
        Test a = new Test(17);
        Test b = new Test(17);

        if(s == t){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

        if(s.equals(t)){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

        if(a == b){
            System.out.println("E");
        }else{
            System.out.println("F");
        }

        if(a.equals(b)){
            System.out.println("G");
        }else{
            System.out.println("H");
        }



        System.out.println("s="+ s);
        System.out.println("t="+ t);
        System.out.println("a="+ a);
        System.out.println("b="+ b);




        System.out.println("s="+ System.identityHashCode(s));
        System.out.println("t="+ System.identityHashCode(t));
        System.out.println("a="+ System.identityHashCode(a));
        System.out.println("b="+ System.identityHashCode(b));
    }
}



// javac chapter7/Q15.java
// java chapter7/Q15