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

        Student s = new Student();
// Taking student details as input
        s.setId(sc.nextInt());
        sc.nextLine();

        s.setName(sc.nextLine());
        s.setAge(sc.nextInt());
        sc.nextLine();
        s.setGrade(sc.nextLine());

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGrade());

        sc.close();
    }
}
