# メソッド

### substring()
文字列から任意の文字列を抽出するメソッド

byte型は、10進数に変換したとき-128〜127までの間ならコンパイルエラーは発生しない


### ==equals()の違い
 System.out.println("オペランド==:" + a == b); //値が同じであっても参照先が違うので”==”で比較した場合は”false”を返します。
        System.out.println("equals():" +a.equals(b));//equalsメソッドで比較した場合は値が同じですので、”true”を返しています。