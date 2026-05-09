import java.util.Scanner;
// Student class demonstrating encapsulation

class Student {
    // Input validation constraints:
    // id and age should be positive
    private int id;
    private String name;
    private int age;
    private String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class StudentEncapsulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();
// Taking student details as input
        student.setId(sc.nextInt());
        sc.nextLine();

        student.setName(sc.nextLine());
        student.setAge(sc.nextInt());
        sc.nextLine();
        student.setGrade(sc.nextLine());

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGrade());

        sc.close();
    }
}
