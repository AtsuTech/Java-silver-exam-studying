package chapter6;

public class Q3 {

    static public class SampleException extends Exception{}
    static public class SubSampleException extends SampleException{}

    public static void main(String[] args) {
        try{
            sample();
            sub();
        }catch(SampleException e){
            System.out.println("A");
        }catch(SubSampleException e){
            System.out.println("A");
        }


    }

    private static void sample() throws SampleException{
        throw new SampleException();
    }

    private static void sub() throws SubSampleException{
        throw new SubSampleException();
    }

}
