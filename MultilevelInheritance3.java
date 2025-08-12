class Person {
    void displayName() {
        System.out.println("Name: Ganesh ");
    }
}

class Employee extends Person {
    void showEmployeeId() {
        System.out.println("Employee ID: E1234");
    }
}

class Manager extends Employee {
    void showDepartment() {
        System.out.println("Department: IT");
    }
}

public class MultilevelInheritance3 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayName();
        m.showEmployeeId();
        m.showDepartment();
    }
}
