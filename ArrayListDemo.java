import java.util.*;

class ArrayListDemo {
    public static void main(String []args) {

        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");


        System.out.println(fruits);
        System.out.println("getmethod:"+fruits.get(1));

        fruits.set(1,"orange");
        System.out.println("aftetr update list:"+fruits);
    }
}
