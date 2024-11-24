package com.bullet.comparator;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee another) {
        return employee.getDepartment().compareTo(another.getDepartment());
        //return 0;
    }
}
