package chapter5;

public class Q24 {
    
    // static public class A{}
    // static public class B{}

    public class Sample1 permit A,B{

    }

    public sealed class Sample2 permits A,B{

    }

    public abstract class Sample3 extends A, B{

    }

    public sealed class Sample4 extends A, B{

    }


    
}
