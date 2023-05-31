package company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getTotalPaymentInMonth(List<Employee> employees, int month, int year) {
        double totalPayment = 0.0;
        for (Employee employee : employees) {
            if (employee.getHireDate().getMonthValue() <= month &&
                    employee.getHireDate().getYear() <= year) {
                if (employee instanceof Secretary) {
                    Secretary secretary = (Secretary) employee;
                    totalPayment += secretary.calculateSalary(year - employee.getHireDate().getYear());
                } else if (employee instanceof Salesperson) {
                    Salesperson salesperson = (Salesperson) employee;
                    totalPayment += salesperson.calculateSalary(year - employee.getHireDate().getYear());
                } else if (employee instanceof Manager) {
                    Manager manager = (Manager) employee;
                    totalPayment += manager.calculateSalary(year - employee.getHireDate().getYear());
                }
            }
        }
        return totalPayment;
    }

    public double getTotalSalaryPaymentInMonth(List<Employee> employees, int month, int year) {
        double totalSalaryPayment = 0.0;
        for (Employee employee : employees) {
            if (employee.getHireDate().getMonthValue() <= month &&
                    employee.getHireDate().getYear() <= year) {
                if (employee instanceof Secretary) {
                    Secretary secretary = (Secretary) employee;
                    totalSalaryPayment += secretary.calculateSalary(year - employee.getHireDate().getYear());
                } else if (employee instanceof Salesperson) {
                    Salesperson salesperson = (Salesperson) employee;
                    totalSalaryPayment += salesperson.calculateSalary(year - employee.getHireDate().getYear());
                } else if (employee instanceof Manager) {
                    Manager manager = (Manager) employee;
                    totalSalaryPayment += manager.calculateSalary(year - employee.getHireDate().getYear());
                }
            }
        }
        return totalSalaryPayment;
    }

    public double getTotalBenefitPaymentInMonth(List<Employee> employees, int month, int year) {
        double totalBenefitPayment = 0.0;
        for (Employee employee : employees) {
            if (employee.getHireDate().getMonthValue() <= month &&
                    employee.getHireDate().getYear() <= year && employee instanceof Secretary) {
                Secretary secretary = (Secretary) employee;
                totalBenefitPayment += secretary.calculateSalary(year - employee.getHireDate().getYear()) - secretary.calculateSalary(0);
            }
        }
        return totalBenefitPayment;
    }

    public Employee getHighestPaidEmployeeInMonth(List<Employee> employees, int month, int year) {
        double highestPayment = 0.0;
        Employee highestPaidEmployee = null;
        for (Employee employee : employees) {
            if (employee.getHireDate().getMonthValue() <= month &&
                    employee.getHireDate().getYear() <= year) {
                if (employee instanceof Secretary) {
                    Secretary secretary = (Secretary) employee;
                    double payment = secretary.calculateSalary(year - employee.getHireDate().getYear());
                    if (payment > highestPayment) {
                        highestPayment = payment;
                        highestPaidEmployee = employee;
                    }
                } else if (employee instanceof Salesperson) {
                    Salesperson salesperson = (Salesperson) employee;
                    double payment = salesperson.calculateSalary(year - employee.getHireDate().getYear());
                    if (payment > highestPayment) {
                        highestPayment = payment;
                        highestPaidEmployee = employee;
                    }
                } else if (employee instanceof Manager) {
                    Manager manager = (Manager) employee;
                    double payment = manager.calculateSalary(year - employee.getHireDate().getYear());
                    if (payment > highestPayment) {
                        highestPayment = payment;
                        highestPaidEmployee = employee;
                    }
                }
            }
        }
        return highestPaidEmployee;
    }

    public Employee getHighestBenefitPaidEmployeeInMonth(List<Employee> employees, int month, int year) {
        double highestBenefit = 0.0;
        Employee highestBenefitEmployee = null;
        for (Employee employee : employees) {
            if (employee.getHireDate().getMonthValue() <= month &&
                    employee.getHireDate().getYear() <= year && employee instanceof Secretary) {
                Secretary secretary = (Secretary) employee;
                double benefit = secretary.calculateSalary(year - employee.getHireDate().getYear()) - secretary.calculateSalary(0);
                if (benefit > highestBenefit) {
                    highestBenefit = benefit;
                    highestBenefitEmployee = employee;
                }
            }
        }
        return highestBenefitEmployee;
    }

    public Salesperson getTopSalespersonInMonth(List<Salesperson> salespeople, int month, int year) {
        double highestSales = 0.0;
        Salesperson topSalesperson = null;
        for (Salesperson salesperson : salespeople) {
            if (salesperson.getHireDate().getMonthValue() <= month &&
                    salesperson.getHireDate().getYear() <= year) {
                double totalSales = salesperson.calculateSalary(year - salesperson.getHireDate().getYear()) - salesperson.calculateSalary(0);
                if (totalSales > highestSales) {
                    highestSales = totalSales;
                    topSalesperson = salesperson;
                }
            }
        }
        return topSalesperson;
    }
}