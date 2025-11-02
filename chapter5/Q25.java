package chapter5;

public class Q25 {
    
    static public sealed class Sample permits A{

    }

    // public final class A extends Sample{} //OK

    //public sealed class A extends Sample{} //NG

    // public non-sealed class A extends Sample{} //OK

    // public class A extends Sample{} //NG
}
