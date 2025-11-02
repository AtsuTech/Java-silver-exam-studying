package playground;



public record RecordTest() {
    //コンパイルエラーになる
    private String name;
} 


//javac playground/RecordTest.java