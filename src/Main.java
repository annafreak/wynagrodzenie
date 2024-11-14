abstract class Employee {
    protected String position;
    protected double baseSalary;
    protected double overtimeHours;
    protected double hourlyRate;
    protected double bonuses;

    public Employee(String position, double baseSalary, double overtimeHours, double hourlyRate, double bonuses) {
        this.position = position;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
        this.bonuses = bonuses;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {

    public Manager(double baseSalary, double overtimeHours, double hourlyRate, double bonuses) {
        super("Manager", baseSalary, overtimeHours, hourlyRate, bonuses);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate) + bonuses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Stanowisko: " + position);
        System.out.println("Podstawowa płaca: " + baseSalary);
        System.out.println("Nadgodziny: " + overtimeHours + " godzin");
        System.out.println("Stawka godzinowa: " + hourlyRate);
        System.out.println("Premie: " + bonuses);
        System.out.println("Cała kwota: " + calculateSalary());
    }
}

class Programmer extends Employee {

    public Programmer(double baseSalary, double overtimeHours, double hourlyRate, double bonuses) {
        super("Programmer", baseSalary, overtimeHours, hourlyRate, bonuses);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate) + bonuses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Stanowisko: " + position);
        System.out.println("Podstawowa płaca: " + baseSalary);
        System.out.println("Nadgodziny: " + overtimeHours + " godzin");
        System.out.println("Stawka godzinowa: " + hourlyRate);
        System.out.println("Premie: " + bonuses);
        System.out.println("Cała kwota: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager(5000, 10, 50, 1000);
        Employee programmer = new Programmer(4000, 15, 40, 500);

        System.out.println("=== Informacje o Managerze ===");
        manager.displayInfo();

        System.out.println("\n=== Informacje o Programiście ===");
        programmer.displayInfo();
    }
}
