package chapter4;

    public class Q31 {

        //レコードの宣言
        //recordを加えるだけで、toStringをはじめとするメソッドが自動的に実装される
        public record Book(String name, int price ,String author) {

        }

        public static void main(String[] args) {
            Book b = new Book("Java",20,"kurohon");
            System.out.println(b.name);
            System.out.println(b.toString());
            System.out.println(b.hashCode());

            //Book b2 = new Book("Ruby",40,"syuwasystem");
            Book b2 = new Book("Java",20,"kurohon");
            System.out.println(b.equals(b2));
        }
    }



//java chapter4/Q31

// 逆コンパイル
// javap -c chapter4/Q31