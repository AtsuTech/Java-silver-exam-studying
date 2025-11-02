package chapter4;

public class Q17 {
    public static void main(String[] args) {
        //本題とは関係ないが、javaでは自分自身のクラスをインスタンスできる
        Q17 m = new Q17();
        System.out.println(m.calc(2,3));
        //数値リテラルはデフォでint型と解釈される
    }

    //関数①
    private double calc(double a,int b){
        return (a+b) /2 ;
    }

    //関数②
    private double calc(int a,double b){
        return (a+b) /2 ;
    }

    //関数②は関数①を正しくオーバーライドしている(型の引数が異なる)
    //ambiguous=曖昧な
}

// java chapter4/Q17