import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("Animals: " + animals);

        animals.addFirst("Lion");
        animals.addLast("Tiger");
        System.out.println("After addFirst & addLast: " + animals);

        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());

        animals.remove("Dog");
        System.out.println("After remove Cat: " + animals);
    }
}
