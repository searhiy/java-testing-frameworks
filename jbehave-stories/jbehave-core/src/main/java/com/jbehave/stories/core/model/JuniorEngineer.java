package com.jbehave.stories.core.model;

import com.jbehave.stories.core.strategies.JuniorAlgorithm;
import com.jbehave.stories.core.strategies.SalaryAlgorithm;

/**
 * Created by serhii on 07.12.14.
 */
public class JuniorEngineer extends Worker {

    private SalaryAlgorithm salaryAlgorithm = new JuniorAlgorithm();

    public JuniorEngineer(){

    }

    public JuniorEngineer(double hourRate){
        setHourRate(hourRate);
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return salaryAlgorithm.calculateSalary(reportedHours, getHourRate(), this);
    }
}