package com.bullet.comparator;

import java.util.Comparator;

/**
 * @author brilliant
 * @author com.bullet
 * @since 24-11-2024
 * */

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee another) {
        return (int)(employee.getSalary() - another.getSalary());
        //return 0;
    }
}
