import java.util.*;


public class VectorDemo {
    public static void main(String[]args){
        Vector<String> fruit =new Vector<>();

        fruit.add("mango");
        fruit.add("orange");
        System.out.println("vector "+fruit);
        fruit.set(1,"sddd");
        System.out.println(fruit);

        fruit.get(0);
        System.out.println(fruit);
    }
}
