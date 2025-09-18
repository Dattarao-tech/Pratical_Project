import java.util.Stack;

public class StackDemo {
    public static void main(String[]args){
        Stack<String> animal=new Stack<>();

        animal.push("dog");
        animal.push("cat");
        animal.push("got");
        System.out.println(animal);

      System.out.println( " pop "+animal.pop());
        System.out.println(animal);

    }
}
