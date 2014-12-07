package com.jbehave.stories.core.strategies;

import com.jbehave.stories.core.model.Worker;

/**
 * Created by serhii on 07.12.14.
 * General strategy algorithm.
 */
public interface SalaryAlgorithm {

    public double calculateSalary(int hours, double rate, Worker worker);
}
