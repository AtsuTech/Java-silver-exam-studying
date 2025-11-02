package chapter2;



public class Q31 {

    //staticが例題ではないけど、配列に値を入れるために必要
    public static class Item {
        String name;
        int price = 100;

        //---コンストラクくタを書く場合
        // public Item(String name,int price){
        //     this.name = name;
        //     this.price = price;
        // }
    }

    public static void main(String[] args){

        //----これは例題のコード。正しく動かず例外がスローされる----//
        Item[] items = new Item[3];
        int total = 0;
        for (int i =0; i< items.length; i++){
            total += items[i].price;//ここでpriceフィールドにアクセスする時に、参照先に要素が無いのでエラーになる
        }
        System.out.println(total);

        //意図した動きになるように改造
        // Item[] items = new Item[3];
        // int total = 0;
        // for (int i =0; i< items.length; i++){
        //     items[i] = new Item();
        //     items[i].price = 100*i;
        //     items[i].name = "prdduct" + i;
        //     total += items[i].price;
        // }
        // System.out.println(total);
    }
}



//javac Q31.java
//java chapter2/Q31
