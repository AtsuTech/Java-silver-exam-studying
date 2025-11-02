package chapter3;

public class Q40 {
    public static void main(String[] args) {
        String[] array = {"A", "B"};
        //String[] array = {"A", "X", "B","C"};
        for (String a: array) {
            for(String b :array){
                if("B".equals(b))
                    //条件に合致したら、以後の繰り返し処理は行われない
                    break;
                System.out.println(b);
            }
        }
    }
}


// javac chapter3/Q40.java
// java chapter3/Q40