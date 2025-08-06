public class PreDecexpression {
    public static void main(String[] args) {
        int a = 80;
        int b = 90;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        int result = --a + b;

        System.out.println("After pre-decrement (--a + b):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
    }
}
