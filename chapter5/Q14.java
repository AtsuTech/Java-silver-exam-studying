package chapter5;

public class Q14 {
    
    public interface Worker {
        void work();
    }

    static class Employee implements Worker{
        public void work(){
            System.out.println("work");
        }
        public void report(){
            System.out.println("report");
        }
    }

    static class Engineer extends Employee {
        public void create(){
            System.out.println("create future");
        }
    }

    public static void main(String[] args) {
        Worker a = new Engineer();
        Employee b = new Engineer();
        Engineer c = new Engineer();
        a.create(); //定義した型で使われていないメソッドそは使用不可。aはWorker型で定義されているが、Workerインターフェースにはcreate()というメソッドは存在しない
        b.work();
        c.report();
    }
}
