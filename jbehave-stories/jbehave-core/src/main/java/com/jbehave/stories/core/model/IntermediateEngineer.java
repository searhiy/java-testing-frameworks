package com.jbehave.stories.core.model;

import com.jbehave.stories.core.strategies.IntermediateAlgorithm;
import com.jbehave.stories.core.strategies.SalaryAlgorithm;

/**
 * Created by serhii on 07.12.14.
 */
public class IntermediateEngineer extends Worker {

    private SalaryAlgorithm salaryAlgorithm = new IntermediateAlgorithm();

    public IntermediateEngineer(){
        setHourRate(7);
    }

    public IntermediateEngineer(double hourRate){
        setHourRate(hourRate);
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return salaryAlgorithm.calculateSalary(reportedHours, getHourRate(), this);
    }
}
