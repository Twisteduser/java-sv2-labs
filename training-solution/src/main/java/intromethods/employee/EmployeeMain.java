package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Alison Burgers",2010,1_000_000);
        System.out.println(employee);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        employee.raiseSalary(200_000);
        System.out.println(employee.getSalary());
    }
}
