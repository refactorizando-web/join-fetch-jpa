package com.refactorizando.example.joinfetch.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.refactorizando.example.joinfetch.entity.Department;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
public class DepartmentRepositoryIT {

  @Autowired
  private DepartmentRepository departmentRepository;

  @Test
  @Transactional
  public void withoutJoinFetch() {
    List<Department> departments = departmentRepository.findAll();

    departments.forEach(department -> {
      log.info("Employees -> {} ", department.getEmployees());
    });

  }

  @Test
  @Transactional
  public void withJoinFetch() {
    List<Department> departments = departmentRepository.retrieveAll();

    departments.forEach(department -> {
      log.info("Employees -> {} ", department.getEmployees());
    });
  }

}
