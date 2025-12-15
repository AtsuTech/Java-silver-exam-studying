package chapter6;

public class Q11 {
    
    public class SampleException extends Exception {}
    public class TestException extends RuntimeException {}
    
    public static void main(String[] args) {
        
    }

    // Exception → チェック例外
    // RuntimeException → 非チェック例外


    //チェック例外は、try-catchするかthrows句で宣言するかのどちらかが必要
    //非チェック例外は、try-catchもthrows句で宣言も不要
    public void hello(String name) throws SampleException, TestException{
        if(name == null){
            throw new SampleException();
        }

        if("".equals(name)){
            throw new TestException();
        }
    }

    public void hello2(String name) {
        try {
            throw new SampleException();
        } catch (Exception e) {
            // something
        }

    }
    
}


// answer) A,D