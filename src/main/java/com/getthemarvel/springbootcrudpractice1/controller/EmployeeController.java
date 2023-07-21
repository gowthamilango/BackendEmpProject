package com.getthemarvel.springbootcrudpractice1.controller;

import com.getthemarvel.springbootcrudpractice1.entity.CustomResponse;
import com.getthemarvel.springbootcrudpractice1.entity.Employee;
import com.getthemarvel.springbootcrudpractice1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee")
@RestController
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/add/multiple")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveEmployees(employees);
    }

    @GetMapping("/all")
    public List<Employee> findAllEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/name/{name}")
    public Employee findEmployeesByName(@PathVariable String name) {
        return employeeService.getEmployeeByName(name);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public CustomResponse deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }

}
