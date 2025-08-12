class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

public class HierarchicalInheritance3 {
    public static void main(String[] args) {
        System.out.println("Dog barks: Woof Woof");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println("Cat meows: Meow Meow");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("Cow moos: Moo Moo");
        Cow cow = new Cow();
        cow.eat();
        cow.moo();
    }
}
