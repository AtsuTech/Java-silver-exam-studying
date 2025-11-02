package chapter2;
//import chaptertwo.Ten;

public class UseExternalClass {
    public static void main(String[] args) {
        ExternalClass external = new ExternalClass();
        System.out.println(external);

        //static external.functionA(int 20,int 30);
        int result = external.functionA(20, 30);
        System.out.println("The result of functionA is: " + result);
    }
}
