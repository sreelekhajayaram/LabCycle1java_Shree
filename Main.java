class Employee {
    int employeeId;
    String employeeName;
    double salary;

    Employee(int id, String name, double sal) {
        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("ID       : " + employeeId);
        System.out.println("Name     : " + employeeName);
        System.out.println("Salary   : " + salary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(int id, String name, double sal, String dept, double bonus) {
        super(id, name, sal);
        department = dept;
        this.bonus = bonus;
    }

    void displayManager() {
        displayEmployee();
        System.out.println();
        System.out.println("Manager Details");
        System.out.println("---------------");
        System.out.println("Department : " + department);
        System.out.println("Bonus      : " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Arun", 50000, "Sales", 15000);
        m.displayManager();
    }
}
