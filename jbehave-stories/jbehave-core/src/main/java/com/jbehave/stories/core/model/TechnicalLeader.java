package com.jbehave.stories.core.model;

import com.jbehave.stories.core.strategies.SalaryAlgorithm;
import com.jbehave.stories.core.strategies.TechLeaderAlgorithm;

/**
 * Created by serhii on 07.12.14.
 */
public class TechnicalLeader extends Worker {

    private SalaryAlgorithm salaryAlgorithm = new TechLeaderAlgorithm();

    public TechnicalLeader(){

    }

    public TechnicalLeader(double hourRate){
        setHourRate(hourRate);
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return 0;
    }
}
