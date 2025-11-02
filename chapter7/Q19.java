package chapter7;


//sealedクラスのサブは、final,non-sealed,sealedである必要がある」
public sealed class Q19 permits A ,B, C {
    
}


final class A extends Q19{

}

non-sealed class B extends Q19{

}

sealed class C extends Q19 permits D{

}

final class D extends C{

}
//----------------------------------------------------





//finalのスーパークラスは種類に関わらず定義可能
abstract class AbstSurperClass {
}

final class SubAbstSurperClass{

}
//----------------------------------------------------




final class FinalClass{

    public void nomal(){

    }

    //finalクラスは、抽象メソッドを持てない
    //抽象メソッドは、継承することが前提。継承をfinalクラスは禁止をしているのでNG
    abstract void abst(){

    }
}

//finalクラスは継承を禁止してるので、サブクラスを宣言できない
abstract class SubFinalClass extends FinalClass{

}


abstract class AbstSurperClass2 {
    //抽象クラスはfinalメソッドを含むことができる
    final void nomal(){

    }
}




//シールクラスは継承を限定、言い換えれば継承させるためのクラスなのでfinalをつけて継承禁止にできない
final sealed class SealClass permits SubSealClass{

}
final class SubSealClass extends SealClass{

}
//----------------------------------------------------