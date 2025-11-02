package chapter2;

import java.util.ArrayList;

public class Q38 {
    public static void main(String[] args) {
        //コレクションAPIであれば、どんな型の集合でも扱うことができる。型の混在もOK
        ArrayList list = new ArrayList<>();

        //↑の書き方でもプログラムの実行はできる。しかし、型の混在を防ぐためジェネリクスを下記のように利用するといい
        //以下は書き方違うが同じ処理となる。②はSE7からの省略記法
        //①ArrayList<String> list = new ArrayList<String>();
        //②ArrayList<String> list = new ArrayList<>();

        //Stringとinrが混在
        list.add("A");
        list.add(10);
        list.add("B");
        for (Object obj : list){
            
            System.out.println(obj);
        }
    }
}


//  javac Q38.java
//  java chapter2/Q38