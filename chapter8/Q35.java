package chapter8;

class A{
    private String value;
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String toString(){
        return getValue();
    }
}

class B extends A{
    public void setValue(String value){
        super.setValue("[" + value + "]");
    }
    public void setValues(String... values){
        setValue(test(values));
    }
    private String test(String... values){
        var sb = new StringBuilder();
        for (String value : values){
            sb.append(value + ",");
        }
        return sb.toString();
    }
}


public class Q35 {
    public static void main(String[] args) {
        A a = new B(); 
        //B a = new B(); //Bの型にするとエラー起きない
        a.setValues(args);
        
        //出力する場合
        //System.out.println(a.getValue());
    }
}



// javac chapter8/Q35.java
// java chapter8/Q35