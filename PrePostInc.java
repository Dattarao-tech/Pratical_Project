public class PrePostInc {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("Initial values:");
        System.out.println("a = " + a + " (used with pre-increment)");
        System.out.println("b = " + b + " (used with post-increment)");

        int preResult = ++a + 10;

        int postResult = b++ + 10;

        System.out.println("\nAfter using in expressions:");
        System.out.println("Pre-increment result (++a + 10): " + preResult);
        System.out.println("Post-increment result (b++ + 10): " + postResult);
        System.out.println("Final value of a: " + a);
        System.out.println("Final value of b: " + b);
    }
}
