package com.jbehave.spring.model;

import com.jbehave.stories.core.strategies.SalaryAlgorithm;
import com.jbehave.stories.core.strategies.TechLeaderAlgorithm;

/**
 * Created by serhii on 07.12.14.
 */
public class TechnicalLeader extends Worker {

    private SalaryAlgorithm salaryAlgorithm = new TechLeaderAlgorithm();

    public TechnicalLeader(){
        setHourRate(20);
    }

    public TechnicalLeader(double hourRate){
        setHourRate(hourRate);
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return salaryAlgorithm.calculateSalary(reportedHours, getHourRate(), this);
    }
}
