import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int salary;
        float netSalary;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Salary : ");
        salary = s.nextInt();
        if (salary > 10000) {
            netSalary = salary * 2 / 10;
        } else if (salary < 10000 && salary >= 5000) {
            netSalary = salary / 10;
        } else if (salary < 5000 && salary >= 3000) {
            netSalary = salary * 5 / 100;
        } else {
            netSalary = salary * 2 / 100;
        }
        netSalary = salary + netSalary;
        System.out.println("Net Salary : " + netSalary);
    }
}
