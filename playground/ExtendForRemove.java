package playground;
import java.util.ArrayList;

public class ExtendForRemove {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        //arr.add("E");

        for(String st : arr){
            
            if("C".equals(st)){
                arr.remove(st);
            }else{
                System.out.println(st);
            }
        }
    }
}


// javac playground/ExtendForRemove.java
// java playground/ExtendForRemove