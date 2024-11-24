package com.bullet.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee another) {
        return employee.getId() - another.getId();
        //return 0;
    }
}
