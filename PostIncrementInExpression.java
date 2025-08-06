public class PostIncrementInExpression {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        int result = a++ + b;

        System.out.println("After post-increment (a++ + b):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
    }
}
