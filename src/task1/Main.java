package task1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new FullTimeEmployee("Xaliq", 1, 300), new PartTimeEmployee("Murad", 2, 1.70, 80)};

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());
            employee.displayDetails();
            System.out.println("-----------------------");
        }
    }
}