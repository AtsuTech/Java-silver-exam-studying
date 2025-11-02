package chapter5;

public interface Q3 {
    //コンパイラによって自動的にpublicで修飾される
    //また、インターフェースに定義する抽象メソッドはprotectedやprivateで修飾できない
    void hello(); 
}

// javac Q3.java
// java chapter5/Q3