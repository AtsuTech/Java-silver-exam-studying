package chapter2;
import java.util.ArrayList;

public class Q41 {
    
    //クラス
    public static class Item{
        private String name;
        private int price;
        public Item(String name, int price){
            this.name = name;
            this.price = price;
        }
        public boolean equals(Object obj){
            if(obj instanceof Item){
                Item tmp = (Item) obj;
                if(tmp.name.equals(this.name)){
                    return true;
                }
            }
            return false;
        }
        public String getName(){
            return name;
        }
    }

    //メイン実行
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("A",100));
        list.add(new Item("B",200));
        list.add(new Item("C",300));
        list.add(new Item("A",100));
        //removeメソッドは、inndex番号を指定する方法の他に、引数で受け取ったインスタンスと同値のものも削除できる。
        //また、削除できるのは同値のもののうち、初めに登場する1つの要素しか削除できない
        list.remove(new Item("A",500));
        for(Item item : list){
            System.out.println(item.getName());
        }
    }

}


//javac Q41.java
//java chapter2/Q41
