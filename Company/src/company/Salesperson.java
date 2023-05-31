package company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Salesperson extends Employee {
    private List<Double> sales;

    public Salesperson(String name, LocalDate hireDate) {
        super(name, "Vendedor", hireDate);
        sales = new ArrayList<>();
    }

    public void addSale(double amount) {
        sales.add(amount);
    }

    public double calculateSalary(int yearsOfService) {
        double baseSalary = 12000.0;
        double annualBonus = 1800.0 * yearsOfService;
        double totalSales = sales.stream().mapToDouble(Double::doubleValue).sum();
        double benefit = 0.3 * totalSales;
        return baseSalary + annualBonus + totalSales + benefit;
    }
}
