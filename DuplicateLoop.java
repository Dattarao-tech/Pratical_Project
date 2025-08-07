public class DuplicateLoop {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 3, 1, 6, 7 };
        System.out.println("Duplicate element:");
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;

                }
            }
        }

    }
}