package playground;

public class ClassInMain {
    String name;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    //クラス内でメインメッドを書く(普通は非推奨)
    public static void main(String[] args) {
        ClassInMain val = new ClassInMain();
        val.setName("Hello");
        System.out.println(val.getName());
    }
}


// javac playground/ClassInMain.java
// java playground/ClassInMain