package playground;

public class TestException {
    public static void main(String[] args) throws Exception {
        
        try{
            throw new Exception();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}


// javac TestException.java
// java playground/TestException