public class PrePostDec {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("Initial values:");
        System.out.println("a = " + a + " (used with pre-decrement)");
        System.out.println("b = " + b + " (used with post-decrement)");

        int preResult = --a;
        int postResult = b--;

        System.out.println("\nAfter using in expressions:");
        System.out.println("Result of pre-decrement (--a): " + preResult);
        System.out.println("Value of a after pre-decrement: " + a);

        System.out.println("Result of post-decrement (b--): " + postResult);
        System.out.println("Value of b after post-decrement: " + b);
    }
}
