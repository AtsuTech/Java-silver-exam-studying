package chapter7;

public class Q28 {

    public static void main(String[] args) {
        Item a = new Item("A");
        System.out.println(a.name + a.id + ",");
        Item b = new Item("B");
        System.out.println(b.name + b.id + ",");
        b.id = "2";
        a.name = "C";
        System.out.println(a.name + a.id + ",");
        System.out.println(b.name + b.id + ",");
    }

    static class Item{
        public static String id;
        public String name;
        public Item(String name) {
            this.name = name;
            id = "1";
        }
    }
    
}


// javac Q28.java
// java chapter7/Q28