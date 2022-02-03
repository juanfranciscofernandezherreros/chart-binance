package com.fernandez.chartreactive.service;

import com.fernandez.chartreactive.entity.Employee;
import com.fernandez.chartreactive.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getAll(Query query) {
        return employeeRepository.findAll(query);
    }

    @Override
    public Page<Employee> getPage(Query query, Pageable pageable) {
        return employeeRepository.findAll(query, pageable);
    }
}

