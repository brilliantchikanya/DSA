package com.bullet.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee another) {
        return (int)(employee.getSalary() - another.getSalary());
        //return 0;
    }
}
