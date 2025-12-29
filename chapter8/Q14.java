package chapter8;

//設問のコード改造している

public class Q14 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i : numbers){
            try{
                if(test(i)){
                    System.out.println(i);
                }
            }catch(SampleException e){
                //System.out.println("continue");
                continue;
            }
        }
    }

    private static boolean test(int num) throws SampleException{
        for(int i=2; i < num; i++){
            System.out.println("num="+ num + ":" + "i=" + i);
            if(num % i == 0){
                //System.out.println("num="+ num + ":" + "i=" + i);
                throw new SampleException();
            }
            return true;
        }
        //元のコードではここにreturnが無い
        return false;
    }
}

class SampleException extends Exception {}


//javac chapter8/Q14.java
//java chapter8/Q14