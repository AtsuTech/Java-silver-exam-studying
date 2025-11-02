package chapter7;

class Value{
    public String data;

    public Value(String data){
        this.data = data;
    }

    public String toString(){
        return this.data;
    }
}

public class Q22 {

    private static Value[] values = {
        new Value("A"),
        new Value("B"),
        new Value("C"),
        null
    };

    public static void main(String[] args) {
        System.out.println(values[1]);
        System.out.println(values[2].data);
        System.out.println(values[3]);
    }
}


// javac chapter7/Q22.java
// java chapter7/Q22