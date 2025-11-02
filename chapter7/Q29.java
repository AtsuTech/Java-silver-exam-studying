package chapter7;

public class Q29 {
    
    //メイン実行部分
    public static void main(String[] args) {
        B b = new B();
        b.setValues(args);
        System.out.println(b);
    }

    static class A{
        private String value;

        public String getValue(){
            return value;
        }

        public void setValue(String name){
            this.value = name;
        }

        public String toString(){
            return getValue();
        }
    }

    static class B extends A {
        public void setValue(String value){
            //スーパークラスのsetValueメソッドに、ダブルクォーテーションを付けて加工した文字列をセット
            super.setValue("\"" + value + "\"");
        }

        //上と微妙にメソッド名が違うことに注意
        public void setValues(String[] parts){
            var sb = new StringBuilder();
            //System.out.println("拡張for文前の変数sbの値:"+sb.toString());
            for(String part:parts){
                //appendメソッドは常に、ビルダーの末尾に与えられた文字を追加
                sb.append(part).append(' ');
            }
            //上のsetValueメソッドを呼び出し
            this.setValue(sb.toString());
        }
    }
}


// javac Q29.java
// java chapter7/Q29 A B C