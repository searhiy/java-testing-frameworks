package com.jbehave.spring.strategies;

import com.jbehave.spring.Constants;
import com.jbehave.spring.model.SeniorEngineer;
import com.jbehave.spring.model.Worker;

/**
 * Created by serhii on 07.12.14.
 */
public class SeniorAlgorithm implements SalaryAlgorithm {

    @Override
    public double calculateSalary(int hours, double rate, Worker worker) {
        double salary = hours * rate;
        if (worker.isBonus()) {
            salary += SeniorEngineer.BONUS;
        }
        salary += Constants.LEAD_ACTIVITIES_INCOME;

        return salary;
    }
}
