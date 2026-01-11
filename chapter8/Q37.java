package chapter8;
import java.util.ArrayList;


class Sample{
    String name;
}

public class Q37 {
    var sample = new ArrayList<Sample>();
    public var test(){
        var sample = new Sample();
        var samples = new ArrayList<>();
        samples.add("Java");
        samples.add("PHP");
        for(var s : samples){
            System.out.println(s);
        }
    }
}


// javac chapter8/Q37.java
// java chapter8/Q37