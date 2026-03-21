package playground;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try(
            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            //BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
        ){
            System.out.println("try");
            throw new Exception();
        }catch(IOException e){
            System.out.println("catch"+e);
        }catch(Exception e){
            System.out.println("catch"+e);
        }
    }
}


// javac playground/TryWithResources.java