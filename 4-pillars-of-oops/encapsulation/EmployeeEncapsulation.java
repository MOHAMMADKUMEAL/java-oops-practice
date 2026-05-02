import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private String designation;
    private String email;
    private long phone;
    private double salary;

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        // Taking employee ID input
        emp.setEmpId(sc.nextInt());
        sc.nextLine(); // consume newline

        emp.setEmpName(sc.nextLine());
        emp.setDesignation(sc.nextLine());
        emp.setEmail(sc.nextLine());
        emp.setPhone(sc.nextLong());
        emp.setSalary(sc.nextDouble());

        // Display using getters
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getDesignation());
        System.out.println(emp.getEmail());
        System.out.println(emp.getPhone());
        System.out.println(emp.getSalary());
    }
}
