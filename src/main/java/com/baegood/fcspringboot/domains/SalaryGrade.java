package com.baegood.fcspringboot.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "salarygrade")
@Getter
@Setter
public class SalaryGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long grade;

    @Column(name = "losal")
    private Integer lowSalary;

    @Column(name = "hisal")
    private Integer highSalary;
}
