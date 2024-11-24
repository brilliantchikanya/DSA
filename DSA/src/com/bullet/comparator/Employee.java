package com.bullet.comparator;

import java.util.*;

/**
 * @author brilliant
 * @author com.bullet
 * @since 24-11-2024
 * */
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;
    private double salary;
    private static int counter = 0; // variable used to create a unique ID

    public Employee() {
        id = setID();
        name = "";
        department = "";
        salary = 0;
    }

    public Employee(String name, String department, double salary) {
        id = setID();
        this.name = name;
        this.department = department;
        this.salary = salary;
    } // end of constructor

    public int getId() {
        return id;
    }

    public int setID() {
        return ++counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* This method tests for the equality of values for two objects*/
    @Override
    public boolean equals(Object comparisonObject) {
        if (this == comparisonObject) return true; // == operator checks whether the references are
                                                   // are for the same object
        if (!(comparisonObject instanceof Employee)) return false;
        Employee employee = (Employee) comparisonObject;
        return getId() == employee.getId() && (getSalary() == employee.getSalary()) &&
                getName().compareTo(employee.getName()) == 0 &&
                Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDepartment(), getSalary());
    }

    /* This method checks whether the names of two employees are the same. It is used for
    *  sorting members of the Employee class*/
    @Override
    public int compareTo(Employee employee) {
        if (this == employee) return 0; /* If the references refer to the same object, then
                                        automatically the names are the same*/
        return this.getName().compareTo(employee.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    /* The method prints each member of a list in a separate line*/
    public static void printList(List list) {
        for(Object object: list) System.out.println(object);
    }

    /* This method creates space for readability of output on Standard Output*/
    public static void printStars() {
        System.out.println(" ");
        System.out.println("***********************************************************************");
        System.out.println(" ");
    }

    public static void sortByDepartment(List<Employee> employeeList) {
        Comparator departmentComparator = new DepartmentComparator();
        Collections.sort(employeeList, departmentComparator);
    }

    public static void sortByID(List<Employee> employeeList) {
        Comparator idComparator = new IdComparator();
        Collections.sort(employeeList, idComparator);
    }

    public static void sortBySalary(List<Employee> employeeList) {
        Comparator salaryComparator = new SalaryComparator();
        Collections.sort(employeeList, salaryComparator);
    }


}
