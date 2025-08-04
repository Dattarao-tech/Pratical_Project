public class StringCompare2 {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "c++";

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are eqlual(Ignore case)");
        } else {
            System.out.println("Strings are not eqlual ");
        }
    }
}