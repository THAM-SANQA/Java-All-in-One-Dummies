
package book3.chap6;

/**
 * @author thamsanqa 2024
 **/
public class CloneTest {

    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Martinez", "Anthony");
        emp1.setSalary(40000.0);
        Employee2 emp2 = (Employee2) emp1.clone();
        emp1.setLastName("Smith");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

class Employee2 {

    private String lastName;
    private String firstName;
    private double salary;

    public Employee2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Object clone() {
        Employee2 emp;
        emp = new Employee2(
                this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
