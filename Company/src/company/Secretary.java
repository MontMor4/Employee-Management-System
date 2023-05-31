package company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Secretary extends Employee {
    public Secretary(String name, LocalDate hireDate) {
        super(name, "Secretário", hireDate);
    }

    public double calculateSalary(int yearsOfService) {
        double baseSalary = 7000.0;
        double annualBonus = 1000.0 * yearsOfService;
        double benefit = 0.2 * (baseSalary + annualBonus);
        return baseSalary + annualBonus + benefit;
    }
}
