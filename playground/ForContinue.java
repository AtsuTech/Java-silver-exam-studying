package playground;

public class ForContinue {
    public static void main(String[] args) {
        for(int i =0 ;i<3;i++){
            if(i==1){
                continue;
            }else{
                System.out.println(i);
            }
            System.out.println("---");
            
        }
    }
}


// javac playground/ForContinue.java
// java playground/ForContinue