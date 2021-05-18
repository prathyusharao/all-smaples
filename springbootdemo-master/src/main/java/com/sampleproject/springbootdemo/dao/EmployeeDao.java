package com.sampleproject.springbootdemo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sampleproject.springbootdemo.entity.Employee;

@Repository
public interface EmployeeDao extends MongoRepository<Employee, Integer> {

}
