package chapter5;

public class Q23 {
    
    static public class Super{

        //フィールド(final)
        final String superstr;

        //コンストラクタ(final)
        public Super(String superstr){
            this.superstr = superstr;
        }

        //メソッド(final)
        final void func(){
            
        }
    }

    static final class Sub1 extends Super {
        final String str;

        //コンストラクタ
        public Sub1(String str){
            this.str = str;
        }

        //メソッド
        void func(){

        }
    }

    static final class Sub2 extends Super {
        final int num;

        //コンストラクタ
        public Sub2(int num){
            this.num = num;
        }
        
    }

    //finalでSub1を修飾したので継承できない
    public class UnExtend extends Sub1 {
        
    }


}
