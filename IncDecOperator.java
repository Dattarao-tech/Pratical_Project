public class IncDecOperator {
    public static void main(String[] args) {
        int a = 45;
        int b = 45;

        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int preInc = ++a;
        int postInc = b++;

        System.out.println("\nAfter Increment:");
        System.out.println("Pre-increment (++a): " + preInc);
        System.out.println("Post-increment (b++): " + postInc);
        System.out.println("Updated a: " + a);
        System.out.println("Updated b: " + b);

        int preDec = --a;
        int postDec = b--;

        System.out.println("\nAfter Decrement:");
        System.out.println("Pre-decrement (--a): " + preDec);
        System.out.println("Post-decrement (b--): " + postDec);
        System.out.println("Updated a: " + a);
        System.out.println("Updated b: " + b);
    }
}
