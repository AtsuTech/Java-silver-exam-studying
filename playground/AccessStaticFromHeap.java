package playground;

class StaticVal{
    static int val = 0;
}

public class AccessStaticFromHeap {
    public static void main(String[] args) {
        StaticVal.val = 100;

        StaticVal sv1 = new StaticVal();
        sv1.val = 73209;
        
        System.out.println(StaticVal.val);
    }
}



// javac playground/AccessStaticFromHeap.java
// java playground/AccessStaticFromHeap