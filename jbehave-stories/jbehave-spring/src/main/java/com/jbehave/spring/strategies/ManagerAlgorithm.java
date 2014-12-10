package com.jbehave.spring.strategies;

import com.jbehave.spring.Constants;
import com.jbehave.spring.model.Manager;
import com.jbehave.spring.model.Worker;

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
