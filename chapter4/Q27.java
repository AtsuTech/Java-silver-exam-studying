package chapter4;

public class Q27 {
    public static void main(String[] args) {
        Q27StoryBook story = new Q27StoryBook();
        story.setIsbn("xxx-x-xxxx-xxxx-xx");
        story.printInfo();
    }
}


// javac Q27.java
// java chapter4/Q27


//このコードは、コンパイル時にエラーが起きるようになっている。アクセス修飾の問題。