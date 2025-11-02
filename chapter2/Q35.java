package chapter2;

public class Q35 {
    
    static public interface A {}
    
    static public class B implements A {}
    
    static public class C extends B {}
    
    static public class D extends C {}
    
        
    public static void main(String[] args) {
        // A[] array = {new C(), null ,new D()};
        // Object[] objArray = array;
        A[] array = {new C(),new D()};
        Object[] objArray = array;
        for(Object item: objArray){
            System.out.println(item);
        }
    }

}


// javac Q35.java
// java chapter2/Q35