package com.bullet.comparator;

import java.util.ArrayList;
import java.util.List;

import static com.bullet.comparator.Employee.*;

/**
 * @author brilliant
 * @author com.bullet
 * @since 24-11-2024
 * */

public class Main {
    public static void main(String[] args) {
        Employee paul = new Employee("Paul", "Primary", 500);
        System.out.println(paul);
        Employee mia = new Employee("Mia", "Kinder", 300);
        System.out.println(mia);
        printStars();
        System.out.println("Paul compareTo Mia: " + paul.compareTo(mia));
        String str = "Paul";
        System.out.println("Employee equals String: " + paul.equals(str));
        printStars();
        System.out.println("Paul equals Mia: " + paul.equals(mia));
        printStars();
        Employee test1 = new Employee();
        System.out.println("test1: " + test1);
        Employee test2 = new Employee();
        System.out.println("test2: " + test2);
        Employee test3 = test1;
        System.out.println("test3: " + test3);
        System.out.println("test3 == test1: " + (test3 == test1));
        System.out.println("test1 == test2: " + (test1 == test2));
        System.out.println("test1 equals test2: " + test1.equals(test2));
        System.out.println("test1 compareTo test2: " + test1.compareTo(test2));
        printStars();
        //System.out.println("");
        System.out.println("Creating a list of employees: ");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(paul);
        employeeList.add(mia);
        employeeList.add(test1);
        employeeList.add(test2);
        //System.out.println(employeeList.toString());
        printList(employeeList);
        printStars();
        //System.out.println(" ");
        System.out.println("Sorting employee list by Department:");
        //DepartmentComparator departmentComparator = new DepartmentComparator();
        //Collections.sort(employeeList, departmentComparator);
        sortByDepartment(employeeList);
        printList(employeeList);

        System.out.println(" ");
        System.out.println("Sorting by Salary:");
        //SalaryComparator salaryComparator = new SalaryComparator();
        //Collections.sort(employeeList, salaryComparator);
        sortBySalary(employeeList);
        printList(employeeList);
        printStars();
        System.out.println("Creating another list: ");
        Employee anna = new Employee("Anna", "HR", 350);
        Employee black = new Employee("Black", "ACC", 200);
        Employee charles = new Employee("Charles", "OPS", 700);
        System.out.println(anna);
        System.out.println(black);
        System.out.println(charles);
        System.out.println(" ");
        List<Employee> newList = new ArrayList<>();
        newList.add(anna);
        newList.add(black);
        newList.add(charles);
        System.out.println("Print the list before sorting: ");
        printList(newList);
        System.out.println("");
        System.out.println("Sorting the  employee list by Salary");
        //Collections.sort(newList, salaryComparator);
        sortBySalary(newList);
        printList(newList);
        System.out.println(" ");
        System.out.println("Sorting by Department: ");
        //Collections.sort(newList, departmentComparator);
        sortByDepartment(newList);
        printList(newList);
        //System.out.println("");
        printStars();
        System.out.println("Combining the two lists: ");
        List<Employee> combinedList = newList;
        combinedList.addAll(employeeList);
        System.out.println(" ");
        System.out.println("New Combined list: ");
        //printList(newList);
        System.out.println("Combined employee list before sorting: ");
        printList(combinedList);
        System.out.println("");
        System.out.println("Sorting by Salary");
        //Collections.sort(newList, salaryComparator);
        sortBySalary(combinedList);
        printList(combinedList);
        System.out.println(" ");
        System.out.println("Sorting by Department: ");
        //Collections.sort(newList, departmentComparator);
        sortByDepartment(combinedList);
        printList(combinedList);
        System.out.println("");
        System.out.println("Sorting by ID: ");
        //IdComparator idComparator = new IdComparator();
        //Collections.sort(newList, idComparator);
        sortByID(combinedList);
        printList(combinedList);
    }
}
