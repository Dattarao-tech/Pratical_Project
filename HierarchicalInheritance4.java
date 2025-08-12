class Company {
    void companyDetails() {
        System.out.println("Company: TechNova Solutions");
        System.out.println("Location: pune");
    }
}
class Manager extends Company {
    void managerInfo() {
        System.out.println("Role: Project Manager");
        System.out.println("Name: Mr. ram");
    }
}
class Developer extends Company {
    void developerInfo() {
        System.out.println("Role: Software Developer");
        System.out.println("Name: Ms. tanvi");
    }
}
class Intern extends Company {
    void internInfo() {
        System.out.println("Role: Intern");
        System.out.println("Name: mr. Ganesh");
    }
}
public class HierarchicalInheritance4 {
    public static void main(String[] args) {
        System.out.println("Project Manager");
        Manager manager = new Manager();
        manager.companyDetails();
        manager.managerInfo();

        System.out.println("software developer");
        Developer developer = new Developer();
        developer.companyDetails();
        developer.developerInfo();

        System.out.println("Intern");
        Intern intern = new Intern();
        intern.companyDetails();
        intern.internInfo();
    }
}

