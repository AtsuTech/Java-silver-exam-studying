package chapter4;

public class Q27Book {

    private String isbn;

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    protected void printInfo(){
        System.out.println(isbn);
    }
}


// javac Q27Book.java