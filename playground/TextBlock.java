package playground;

public class TextBlock {
    public static void main(String[] args) {
        String var1 = "apple";
        String var2 = """
                apple
                """;

        System.out.println(var1 == var2);
        System.out.println(var1.equals(var2));
    }
}


// javac playground/TextBlock.java
// java playground/TextBlock