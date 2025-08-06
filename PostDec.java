public class PostDec {
    public static void main(String[] args) {
        int number = 50;

        System.out.println("Initial value: " + number);

        int result = number--;

        System.out.println("Value after post-decrement (number--): " + number);
        System.out.println("Result of post-decrement expression: " + result);
    }
}
