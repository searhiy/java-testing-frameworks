package com.jbehave.spring.strategies;

import com.jbehave.stories.core.Constants;
import com.jbehave.stories.core.model.Manager;
import com.jbehave.stories.core.model.Worker;

/**
 * Created by serhii on 07.12.14.
 */
public class ManagerAlgorithm implements SalaryAlgorithm {

    @Override
    public double calculateSalary(int hours, double rate, Worker worker) {
        double salary = hours * rate;
        if (worker.isBonus()) {
            salary += Manager.BONUS;
        }
        salary += Constants.SUCCESS_INCOME;
        salary += Constants.LEAD_ACTIVITIES_INCOME;
        salary += Constants.MEETINGS_INCOME;

        return salary;
    }
}
