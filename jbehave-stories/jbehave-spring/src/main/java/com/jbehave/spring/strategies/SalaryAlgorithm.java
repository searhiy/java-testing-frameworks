package com.jbehave.spring.strategies;

import com.jbehave.spring.model.Worker;

/**
 * Created by serhii on 07.12.14.
 * General strategy algorithm.
 */
public interface SalaryAlgorithm {

    public double calculateSalary(int hours, double rate, Worker worker);
}
