package com.jbehave.spring.model;

/**
 * Created by serhii on 07.12.14.
 */
public enum Employee {

    JUNIOR("junior"), INTERMEDIATE("intermediate"), SENIOR("senior"), TECHLEAD("techlead"), MANAGER("manager");
    private final String employee;

    Employee(String employee) {
        this.employee = employee;
    }
}
