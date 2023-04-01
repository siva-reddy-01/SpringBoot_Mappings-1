package com.cdk.springdatajpa.controller;

import com.cdk.springdatajpa.entity.Employee;
import com.cdk.springdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody Employee empData){
        employeeRepository.save(empData);
        return ResponseEntity.ok("Data Saved");
    }


    @GetMapping("/getEmployee")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }



}
