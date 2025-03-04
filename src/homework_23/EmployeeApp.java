package homework_23;


/// / Переделать!!!!!!!!!
public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Max", 25, 5000.00);

        employee.info();

        System.out.println(employee.getName());

        Employee peter = new Employee( "Peter", 45, 1000.00);

        System.out.println(peter.getName());
    }
}
