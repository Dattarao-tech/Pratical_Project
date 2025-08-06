public class IncDecOperatorLoop {
    public static void main(String[] args) {

        System.out.println("Incrementing from 1 to 5 using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nDecrementing from 5 to 1 using for loop:");
        for (int i = 5; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("\nIncrementing from 1 to 5 using while loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nDecrementing from 5 to 1 using while loop:");
        int k = 5;
        while (k >= 1) {
            System.out.println("k = " + k);
            --k;
        }
    }
}
