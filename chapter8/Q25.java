package chapter8;

import java.util.ArrayList;

public class Q25 {

    static class A {
        public void hello(){
            var x = new ArrayList<>();
            x.add(0);
            x.add("0");
            System.out.println(x);
        }
    }


    // static class B {
    //     public void hello(){
    //         var a = 0;
    //         a = "0";
    //     }
    // }

    // static class C {
    //     var x = 10;
    // }


    // static class F {
    //     public void hello(int x){
    //         var x = 0;
    //         //var y = 0; //これならエラーにならない
    //     }
    // }

    static class G {
        public void hello(){
            var str = null;
        }
    }
}


// javac chapter8/Q25.java
// java chapter8/Q25