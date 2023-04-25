package com.example.springAssignmentOne.repository;

import com.example.springAssignmentOne.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeJdbc {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Employee> dispAllEmp(){
        return jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper<>(Employee.class));
    }
}
