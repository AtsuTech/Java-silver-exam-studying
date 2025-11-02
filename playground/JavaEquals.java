package playground;

public class JavaEquals {

    static public class ObjectClassSample{
        private int num;
        public ObjectClassSample(int num){
            this.num = num;
        }
    }

    public static void main(String[] args) {
        String hoge = "Hello";
        String fuga = "Hello";
        hoge += "!";
        fuga += "!";

        ObjectClassSample a = new ObjectClassSample(100);
        ObjectClassSample b = new ObjectClassSample(100);

        System.out.println(hoge);
        System.out.println(fuga);
        
        if(hoge == fuga) {
            System.out.println("hogeとfugaとは等しい");
        } else {
            System.out.println("hogeとfugaとは違う");
        }
        
        if(hoge.equals(fuga)) {
            System.out.println("hogeとfugaとは等しい");
        } else {
            System.out.println("hogeとfugaとは違う");
        }


        if(a.equals(b)) {
            System.out.println("aとbとは等しい");
        } else {
            System.out.println("aとbは違います");
        }
    }
    
}


// javac JavaEquals.java
// java playground/JavaEquals