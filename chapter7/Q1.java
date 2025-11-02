package chapter7;

public class Q1 {
    
    static public interface A {
        boolean search(int[] data, int target);
    }

    static public interface B extends A {
        @Override
        default boolean search(int[] data, int target){
            int cnt = 0;
            for(int i: data){
                if(i == target){
                    cnt++;
                }
            }
            return cnt > 0;
        }
    }

    static public class C implements B {}

    public static void main(String[] args) {
        if(new C().search(
            new int[]{1,2,3,7,9},
            Integer.parseInt(args[0])
        )){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}



// javac Q1.java
// java chapter7/Q1 2 5 //←引数も一緒に