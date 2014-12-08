package com.jbehave.spring.model;

import com.jbehave.stories.core.strategies.ManagerAlgorithm;
import com.jbehave.stories.core.strategies.SalaryAlgorithm;

/**
 * Created by serhii on 07.12.14.
 */
public class Manager extends Worker {

    private SalaryAlgorithm salaryAlgorithm = new ManagerAlgorithm();

    public Manager(){

    }

    public Manager(double hourRate){
        setHourRate(hourRate);
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return salaryAlgorithm.calculateSalary(reportedHours, getHourRate(), this);
    }
}
