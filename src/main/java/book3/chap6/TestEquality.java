
package book3.chap6;

/**
 * @author thamsanqa 2024
 **/
public class TestEquality {

    public static void main(String[] args) {
        Employee2 emp1 = new Employee2("Martinez", "Anthony");
        //Employee emp2 = new Employee("Martinez", "Anthony");
        Employee2 emp2 = new Employee2("Boyega", "John");
        if (emp1.equals(emp2)) {
            System.out.println("These employees are the same.");
        } else {
            System.out.println("These are different employees.");
        }
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
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

    public boolean equals(Object obj) {
        //obj equal to itself
        if (this == obj) {
            return true;
        }
        //no obj equals null
        if (this == null) {
            return false;
        }
        //objs of diff types are never equal
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //cast to employee 
        Employee2 emp = (Employee2) obj;
        return this.lastName.equals(emp.getLastName())
                && this.firstName.equals(emp.getFirstName());
    }

}
