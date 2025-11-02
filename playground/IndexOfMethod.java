package playground;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "abcdefghiXte";
        // a:0
        // b:1
        // c:2
        // d:3
        // e:4
        // f:5
        // g:6
        // h:7
        // i:8
        // X:9
        // t:10
        // e:11
        System.out.println(str.indexOf('X'));
    }
}


// javac IndexOfMethod.java
// java playground/IndexOfMethod