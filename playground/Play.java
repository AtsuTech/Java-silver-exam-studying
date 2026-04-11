package playground;

public class Play {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) { 
            int num = array[i];
            sum += i;
        }
        System.out.println(sum);
    }
}
