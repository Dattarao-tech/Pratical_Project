class College {
    void collegeInfo() {
        System.out.println("College: Global Institute of Technology");
        System.out.println("Location: pune");
    }
}
class Student extends College {
    void studentInfo() {
        System.out.println("Student Name: Ganesh");
        System.out.println("Course: BCA");
    }
}
class Professor extends College {
    void professorInfo() {
        System.out.println("Professor Name: Dr Ram");
        System.out.println("Subject: Data Structures");
    }
}
class Staff extends College {
    void staffInfo() {
        System.out.println("Staff Name: mr vaibahv");
        System.out.println("Role: Lab Assistant");
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        System.out.println("student Name: Ganesh");
        Student student = new Student();
        student.collegeInfo();
        student.studentInfo();

        System.out.println("Professor Name: Dr Dattarao");
        Professor professor = new Professor();
        professor.collegeInfo();
        professor.professorInfo();

        System.out.println("Staff Name: mr vaibahv");
        Staff staff = new Staff();
        staff.collegeInfo();
        staff.staffInfo();
    }
}

