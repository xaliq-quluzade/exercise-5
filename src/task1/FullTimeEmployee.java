package task1;

public class FullTimeEmployee implements Employee {
    private String name;
    private int id;
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return this.monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + this.id + "\nName: " + this.name + "\nSalary: " + this.calculateSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
