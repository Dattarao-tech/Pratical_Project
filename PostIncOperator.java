public class PostIncOperator {
    public static void main(String[] args) {
        int number = 23;

        System.out.println("Initial value: " + number);

        int result = number++;

        System.out.println("Value after post-increment (number++): " + number);
        System.out.println("Result of post-increment expression: " + result);
    }
}