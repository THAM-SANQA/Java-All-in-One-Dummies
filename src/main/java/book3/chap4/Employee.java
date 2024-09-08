
package book3.chap4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author thamsanqa 2024
 **/
public class Employee {
    
    public Employee getEmployee() {
        return this;
    }
}

class SalariedEmployee extends Employee {
    
    double salary;
    
    public SalariedEmployee(double salary) {
        this.salary = salary;
    }
    
    public String getFormattedSalary() {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        return cf.format(this.salary);
    }
}

class HourlyEmployee extends Employee {

    double rate;
    
    public HourlyEmployee(double rate) {
        this.rate = rate;
    }
    
    public String getFormattedRate() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.rate);
    }
}

class EmployeeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S for monthly salary. Enter H for hourly wage.");
        String employeeType = sc.nextLine();
        System.out.println("Please enter the amount you receive.");
        double employeeAmount = sc.nextDouble();
        
        Employee emp;
        
        if (employeeType.equalsIgnoreCase("S")) {
            emp = new SalariedEmployee(employeeAmount);
            System.out.println(((SalariedEmployee) emp).getFormattedSalary());
        } else if (employeeType.equalsIgnoreCase("H")) {
            emp = new HourlyEmployee(employeeAmount);
            System.out.println(((HourlyEmployee) emp).getFormattedRate());
        } else {
            System.out.println("Invalid employee type. Please try again.");
            System.exit(0);
        }
    }
}
