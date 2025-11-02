package chapter5;

public class Q19 {

    static class Parent{
        String name;
        String getName(){
            return this.name;
        }
    }

    static public class Child extends Parent{
        String name;
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.name = "sample";
        System.out.println(child.name);
        System.out.println(child.getName());
    }
}


// javac Q19.java
// java chapter5/Q19