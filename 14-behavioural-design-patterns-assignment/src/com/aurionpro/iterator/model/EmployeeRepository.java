package com.aurionpro.iterator.model;

import java.util.List;

public class EmployeeRepository implements IContainer {
    private List<Employee> employees;

    public EmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public IIterator getNameIterator() {
        return new NameIterator();
    }

    @Override
    public IIterator getSalaryIterator() {
        return new SalaryIterator();
    }

    private class NameIterator implements IIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < employees.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return employees.get(index++).getName();
            }
            return null;
        }
    }

    private class SalaryIterator implements IIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < employees.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return employees.get(index++).getSalary();
            }
            return null;
        }
    }
}
