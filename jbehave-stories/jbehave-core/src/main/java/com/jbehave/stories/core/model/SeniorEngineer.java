package com.jbehave.stories.core.model;

import com.jbehave.stories.core.strategies.SalaryAlgorithm;
import com.jbehave.stories.core.strategies.SeniorAlgorithm;

/**
 * Created by serhii on 07.12.14.
 */
public class SeniorEngineer extends Worker {

    private SalaryAlgorithm salaryAlgorithm = new SeniorAlgorithm();

    public SeniorEngineer(){

    }

    public SeniorEngineer(double hourRate){
        setHourRate(hourRate);
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return 0;
    }
}
