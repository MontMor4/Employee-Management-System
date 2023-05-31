package company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    public Manager(String name, LocalDate hireDate) {
        super(name, "Gerente", hireDate);
    }

    public double calculateSalary(int yearsOfService) {
        double baseSalary = 20000.0;
        double annualBonus = 3000.0 * yearsOfService;
        return baseSalary + annualBonus;
    }
}
