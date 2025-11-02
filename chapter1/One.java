package chapter1;

public class One {
    public static void main(String[] args){
        int val = 7;

        //boolは間違い
        //bool flg = true;

        boolean flg = true;
        if(flg == true){
            do{
                System.out.println(val);
            } while (val > 10);
        }
    }
}

// Run : java chapterone/One