package chapter7;

import java.util.logging.Logger;


public class Q37 {
    static final Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        var d = new Q37Sample("sample");
        logger.info(d.toString());
    }
}



// javac chapter7/Q37.java
// java chapter7/Q37