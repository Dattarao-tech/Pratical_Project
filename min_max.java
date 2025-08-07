public class min_max {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 3, 1, 6, 7 };
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (i == arr.length - 1) {
                System.out.println("min number is " + min);
                System.out.println("max number is " + max);
            }

                }
            }
        }