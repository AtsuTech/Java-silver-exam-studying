package chapter5;

public class Q5 {
    
    public static class B implements Q5Interface {
        @Override
        public String toString(){
            return "B";
        }
        
    }

    public static void main(String[] args) {
        Q5Interface a = new B();
        System.out.println(a);
    }
}
