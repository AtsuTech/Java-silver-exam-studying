package chapter2;

public class Q21 {
    public static void main(String[] args) {
        String html = """
                <html>
                    <head>
                        <titlle>Java</titlle>
                    </head>
                </html>
                """;
        System.out.println(html);

        String msg = """
                this is 
                long text.
                """;
        System.out.println(msg);

        String msg2 = """
                this is ¥
                long text.""";     
        System.out.println(msg2);

        String msg3 = """
                this is ¥n
                long text.""";   
        System.out.println(msg3);
    }
}
