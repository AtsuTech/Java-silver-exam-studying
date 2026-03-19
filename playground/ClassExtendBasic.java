package playground;

class Parent{
    String name;
    String getName(){
        return "value=" + this.name;
    }
}

class Child extends Parent {
    String name;
}

public class ClassExtendBasic {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "sample";
        System.out.println(child.getName());
    }
}

// javac playground/ClassExtendBasic.java
// java playground/ClassExtendBasic