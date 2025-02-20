package com.aurionpro.iterator.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.iterator.model.Employee;
import com.aurionpro.iterator.model.EmployeeRepository;
import com.aurionpro.iterator.model.IIterator;

public class EmployeeIteratorTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Akshat", 50000),
            new Employee(2, "Aadit", 60000),
            new Employee(3, "Vatsal", 55000),
            new Employee(4, "Mustafa", 65000)
        );

        EmployeeRepository repository = new EmployeeRepository(employees);

        System.out.println("Employee Names:");
        IIterator nameIterator = repository.getNameIterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }
        
        System.out.println();
        System.out.println("Employee Salaries:");
        IIterator salaryIterator = repository.getSalaryIterator();
        while (salaryIterator.hasNext()) {
            System.out.println(salaryIterator.next());
        }
    }
}
