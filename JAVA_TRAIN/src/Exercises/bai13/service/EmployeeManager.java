package Exercises.bai13.service;

import Exercises.bai13.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public EmployeeManager() {
        this.employees =new ArrayList<>();
    }

    public void insert(Employee employee){
        this.employees.add(employee);
    }

    public Employee findById(String id){
        return this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean deleteById(String id){
        Employee employee = this.findById(id);
        if (employee == null){
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    public List<Employee> findAll(){
        return this.employees;
    }


}
