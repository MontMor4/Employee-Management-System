package company;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String position;
    private LocalDate hireDate;

    public Employee(String name, String position, LocalDate hireDate) {
        this.name = name;
        this.position = position;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}
