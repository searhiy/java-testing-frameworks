package com.jbehave.spring.steps;

import com.jbehave.spring.Calculator;
import com.jbehave.spring.CalculatorImpl;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;


/**
 * Created by serhii on 07.12.14.
 */
public class CalculatorSteps {

    private Calculator calculator = new CalculatorImpl();


    @Given("as a $employee")
    public void aEmployee(String employee) {
        calculator.identifyWorker(employee);
    }

    @Given("as a $employee with hour rate $rate")
    public void aEmployee(String employee, double rate) {
        calculator.identifyWorkerWithRate(employee, rate);
    }

    @When("project delivered earlier")
    public void deliveredEarlier() {
        calculator.setBonus(true);
    }

    @Then("salary should be $salary")
    public void theSalaryShouldBe(double salary) {
        assertEquals(salary, calculator.calculateSalary(40), 0.1);
    }
}
