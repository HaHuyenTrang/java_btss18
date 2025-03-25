package bai10;

class Employee {
    private static int idCount = 1;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = idCount++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
