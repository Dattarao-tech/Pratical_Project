import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] num = { 25, 12, 9, 30, 18, 40, 22 };
        Arrays.sort(num);
        System.out.println("Sorted array: " + Arrays.toString(num));
        int SecondLargest = num[num.length - 2];
        System.out.println("Second largest element: " + num[num.length - 2]);
    }
}