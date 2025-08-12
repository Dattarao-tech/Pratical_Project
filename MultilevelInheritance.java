class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

class SportsCar extends Car {
    void turboBoost() {
        System.out.println("SportsCar is using turbo boost!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
        sc.turboBoost();
    }
}
