package com.jbehave.stories.core.strategies;

import com.jbehave.stories.core.Constants;
import com.jbehave.stories.core.model.TechnicalLeader;
import com.jbehave.stories.core.model.Worker;

/**
 * Created by serhii on 07.12.14.
 */
public class TechLeaderAlgorithm implements SalaryAlgorithm {

    @Override
    public double calculateSalary(int hours, double rate, Worker worker) {
        double salary = hours * rate;
        if (worker.isBonus()) {
            salary += TechnicalLeader.BONUS;
        }
        salary += Constants.LEAD_ACTIVITIES_INCOME;
        salary += Constants.TEACHING_ACTIVITIES_INCOME;
        salary += Constants.MEETINGS_INCOME;

        return salary;
    }
}
