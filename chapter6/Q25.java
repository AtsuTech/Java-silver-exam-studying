package chapter6;


public class Q25 {
    
    static public class TroubleResource implements AutoCloseable{
        @Override
        public void close() throws Exception{
            throw new RuntimeException("trouble");
        }
    }

    public static void main(String[] args) {
        try(TroubleResource a = new TroubleResource()){
            throw new Exception();
        }catch (RuntimeException e){
            System.out.println("A");
        }catch(Exception e){
            System.out.println("B");
        }
    }
}


// javac Q25.java
// java chapter6/Q25