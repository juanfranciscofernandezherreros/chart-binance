package com.fernandez.chartreactive.repository;

import com.fernandez.chartreactive.entity.Employee;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends ResourceRepository<Employee, String> {
}
