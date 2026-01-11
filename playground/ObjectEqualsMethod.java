package playground;

class SomeClass {
    int val;
    public SomeClass(int val){
        this.val = val;
    }
}

public class ObjectEqualsMethod {
    public static void main(String[] args) {
        SomeClass a = new SomeClass(100);
        SomeClass b = new SomeClass(100);
        SomeClass c = a;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}




// javac playground/ObjectEqualsMethod.java
// java playground/ObjectEqualsMethod