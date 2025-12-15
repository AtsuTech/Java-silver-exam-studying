package playground;

public class ContineWhile {
    public static void main(String[] args) {
        for(int i=1;i < 10;i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println("iは" + i + "です");
        }
        System.out.println("End");
    }
    
}


// javac playground/ContineWhile.java
// java playground/ContineWhile