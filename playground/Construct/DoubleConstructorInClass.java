package playground.Construct;

public class DoubleConstructorInClass {
    String item;

    //コンストラクタ１
    public DoubleConstructorInClass(){
        item = "con1";
    }

    //コンストラクタ２
    public DoubleConstructorInClass(String item){
        //item = item; //これだとitem=null
        this.item = item;
    }

    public String toString(){
        return item;
    }

    public static void main(String[] args) {
        System.out.println(new DoubleConstructorInClass());
        System.out.println(new DoubleConstructorInClass("con2"));
    }

}


// java playground/Construct/DoubleConstructorInClass.java