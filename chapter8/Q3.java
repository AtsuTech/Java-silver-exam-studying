package chapter8;

public class Q3 {
    private String contents;

    public Q3(String contents){
        super();
        this.contents = contents;
    }

    public Q3(){
        this.contents = "";
    }

    public static void print(){
        System.out.println(contents);
    }

    public static void main(String[] args) {
        Q3.print();
    }
}


// javac chapter8/Q3.java
// java chapter8/Q3