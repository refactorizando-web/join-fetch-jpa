package com.refactorizando.example.joinfetch.repository;

import com.refactorizando.example.joinfetch.entity.Department;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Department, Integer> {

  @Query("SELECT DISTINCT department FROM Department department " + "JOIN FETCH department.employees employees")
  List<Department> retrieveAll();
}
