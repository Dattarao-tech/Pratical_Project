class College {
    void collegeName() {
        System.out.println("College: National Institute of Technology");
    }
}

class Department extends College {
    void departmentName() {
        System.out.println("Department: Computer Science and Engineering");
    }
}

class Student extends Department {
    void studentDetails() {
        System.out.println("Student Name: Ganesh");
        System.out.println("Roll No: CS20250123");
    }
}

public class MultilevelInheritance4 {
    public static void main(String[] args) {
        Student s = new Student();

        s.collegeName();
        s.departmentName();
        s.studentDetails();
    }
}
