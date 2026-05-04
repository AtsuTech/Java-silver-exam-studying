package playground;

public class TextBlock {
    public static void main(String[] args) {
        String var1 = "apple";
        String var2 = """
                apple
                """;

        String html3 = """
                <html>
                    <body>
                        <h1>"Java Silver"</h1>
                    </body>
                </html>
                """;

        String html4 = """
                <html>\
                    <body>\
                        <h1>"Java Silver"</h1>\
                    </body>\
                </html>
                """;

        String html4_2 = """
                <html>¥
                    <body>¥
                        <h1>"Java Silver"</h1>¥
                    </body>¥
                </html>
                """;

        int val = 17;
        String html_val = """
                <html>
                    <body>
                        <h1>"Java Silver" %d </h1>
                    </body>
                </html>
                """.formatted(val);


        System.out.println(var1 == var2);
        System.out.println(var1.equals(var2));

        System.out.println(html3);
        System.out.println(html4);
        System.out.println(html4_2);



        System.out.println(html_val);
    }
}


// javac playground/TextBlock.java
// java playground/TextBlock