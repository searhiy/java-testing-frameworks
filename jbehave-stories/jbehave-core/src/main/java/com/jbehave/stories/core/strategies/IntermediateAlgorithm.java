package com.jbehave.stories.core.strategies;

import com.jbehave.stories.core.model.IntermediateEngineer;
import com.jbehave.stories.core.model.Worker;

/**
 * Created by serhii on 07.12.14.
 */
public class IntermediateAlgorithm implements SalaryAlgorithm {

    @Override
    public double calculateSalary(int hours, double rate, Worker worker) {
        double salary = hours * rate;
        if (worker.isBonus()) {
            salary += IntermediateEngineer.BONUS;
        }

        return salary;
    }
}
