public class PreIncExpression {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        int result = ++a + b;

        System.out.println("After pre-increment (++a + b):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
    }
}
