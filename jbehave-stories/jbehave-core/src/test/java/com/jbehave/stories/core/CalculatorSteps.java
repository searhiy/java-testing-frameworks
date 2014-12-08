package com.jbehave.stories.core;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.jbehave.stories.core.util.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.junit.Assert.assertEquals;

/**
 * Created by serhii on 07.12.14.
 */
public class CalculatorSteps {

    private Calculator calculator = new CalculatorImpl();

    @Test
    public void salaryCalculatorAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("salary.story")
                .run();
    }

    @Given("as a $employee with hour rate $rate")
    public void aEmployee(String employee, double rate) {
        calculator.identifyWorkerWithRate(employee, rate);
    }

    @Given("as a $employee")
    public void aEmployee(String employee) {
        calculator.identifyWorker(employee);
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
