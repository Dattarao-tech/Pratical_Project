import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap
{
    public static void main(String[] args) 
    {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Before swap: " + fruits);

        Collections.swap(fruits, 0, 2);

        System.out.println("After swap: " + fruits);
    }
}
