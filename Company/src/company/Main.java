package company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Adicionando funcionários
        company.addEmployee(new Secretary("Jorge Carvalho", LocalDate.of(2018, Month.JANUARY, 1)));
        company.addEmployee(new Secretary("Maria Souza", LocalDate.of(2015, Month.DECEMBER, 1)));
        company.addEmployee(new Salesperson("Ana Silva", LocalDate.of(2021, Month.DECEMBER, 1)));
        company.addEmployee(new Salesperson("João Mendes", LocalDate.of(2021, Month.DECEMBER, 1)));
        company.addEmployee(new Manager("Juliana Alves", LocalDate.of(2017, Month.JULY, 1)));
        company.addEmployee(new Manager("Bento Albino", LocalDate.of(2014, Month.MARCH, 1)));

        // Registrando vendas dos vendedores
        List<Salesperson> salespeople = new ArrayList<>();
        for (Employee employee : company.getEmployees()) {
            if (employee instanceof Salesperson) {
                salespeople.add((Salesperson) employee);
            }
        }
        
        // Ana Silva
        salespeople.get(0).addSale(5200.0);
        salespeople.get(0).addSale(4000.0);
        salespeople.get(0).addSale(4200.0);
        salespeople.get(0).addSale(5850.0);
        salespeople.get(0).addSale(7000.0);
        
        // João Mendes
        salespeople.get(1).addSale(3400.0);
        salespeople.get(1).addSale(7700.0);
        salespeople.get(1).addSale(5000.0);
        salespeople.get(1).addSale(5900.0);
        salespeople.get(1).addSale(6500.0);

        // Testando funcionalidades
        int month = 5;
        int year = 2023;

        double totalPayment = company.getTotalPaymentInMonth(company.getEmployees(), month, year);
        double totalSalaryPayment = company.getTotalSalaryPaymentInMonth(company.getEmployees(), month, year);
        double totalBenefitPayment = company.getTotalBenefitPaymentInMonth(company.getEmployees(), month, year);
        Employee highestPaidEmployee = company.getHighestPaidEmployeeInMonth(company.getEmployees(), month, year);
        Employee highestBenefitEmployee = company.getHighestBenefitPaidEmployeeInMonth(company.getEmployees(), month, year);
        Salesperson topSalesperson = company.getTopSalespersonInMonth(salespeople, month, year);
        
        System.out.println("Date: " + month + "/" + year);
        System.out.println("Total payment in the month: R$" + totalPayment);
        System.out.println("Total salary payment in the month: R$" + totalSalaryPayment);
        System.out.println("Total benefit payment in the month: R$" + totalBenefitPayment);
        System.out.println("Highest paid employee in the month: " + highestPaidEmployee.getName());
        System.out.println("Employee with the highest benefit in the month: " + highestBenefitEmployee.getName());
        if(topSalesperson != null) {
            System.out.println("Top salesperson in the month: " + topSalesperson.getName());
        } else {
            System.out.println("No salesperson recorded sales in the month");
        }
    }
}

