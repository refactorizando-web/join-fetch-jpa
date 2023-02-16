package com.refactorizando.example.joinfetch.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Employee {

  private String name;

  private String surname;

}
