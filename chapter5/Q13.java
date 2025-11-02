package chapter5;

public class Q13 {
    
    static interface Worker {
        void work();
    }

    static class Employee{
        public void work(){
            System.out.println("work");
        }
    }

    static class Enginner extends Employee implements Worker{ }


    public static void main(String[] args) {
        Worker worker = new Enginner();
        worker.work();
    }
}


// javac Q13.java
// java chapter5/Q13