package com.jbehave.stories.core;

import com.jbehave.stories.core.model.Worker;

/**
 * Created by serhii on 07.12.14.
 */
public class CalculatorImpl implements Calculator {

    private Worker worker;

    public CalculatorImpl(Worker worker){
        this.worker = worker;
    }

    @Override
    public double calculateSalary(int reportedHours) {
        return worker.calculateSalary(reportedHours);
    }
}
