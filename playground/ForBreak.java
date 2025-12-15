package playground;

public class ForBreak {
    public static void main(String[] args) {
        for(int i =0; i < 10; i++){
            if(i == 6){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}


// javac playground/ForBreak.java
// java playground/ForBreak