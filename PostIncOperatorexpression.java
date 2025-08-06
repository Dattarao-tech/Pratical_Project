public class PostIncOperatorexpression {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;

        System.out.println("Initial values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int result = x++ * y;

        System.out.println("\nExpression: result = x++ * y");
        System.out.println("After expression:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("result = " + result);
    }
}
