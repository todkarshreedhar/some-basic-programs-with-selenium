package oops.concepts;

public class Constructor {
    int empNo;
    String name;
    double salary;

    public Constructor(int empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee No: " + empNo);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
