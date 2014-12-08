package com.jbehave.spring.strategies;

import com.jbehave.stories.core.model.JuniorEngineer;
import com.jbehave.stories.core.model.Worker;

/**
 * Created by serhii on 07.12.14.
 */
public class JuniorAlgorithm implements SalaryAlgorithm {

    @Override
    public double calculateSalary(int hours, double rate, Worker worker) {
        double salary = hours * rate;
        if (worker.isBonus()) {
            salary += JuniorEngineer.BONUS;
        }

        return salary;
    }
}
