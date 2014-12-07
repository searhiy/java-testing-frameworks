package com.jbehave.stories.core;

import com.jbehave.stories.core.model.*;
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

    private Worker worker;

    @Test
    public void salaryCalculatorAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("salary.story")
                .run();
    }

    @Given("as a $employee with hour rate $rate")
    public void aEmployee(String employee, double rate) {
        Employee employeeEnum = Employee.valueOf(employee.toUpperCase());
        switch (employeeEnum){
            case JUNIOR: worker = new JuniorEngineer(rate);
                break;
            case INTERMEDIATE: worker = new IntermediateEngineer(rate);
                break;
            case SENIOR: worker = new SeniorEngineer(rate);
                break;
            case TECHLEAD: worker = new TechnicalLeader(rate);
                break;
            case MANAGER: worker = new Manager(rate);
                break;
        }
    }

    @Given("as a $employee")
    public void aEmployee(String employee) {
        Employee employeeEnum = Employee.valueOf(employee.toUpperCase());
        switch (employeeEnum){
            case JUNIOR: worker = new JuniorEngineer();
                break;
            case INTERMEDIATE: worker = new IntermediateEngineer();
                break;
            case SENIOR: worker = new SeniorEngineer();
                break;
            case TECHLEAD: worker = new TechnicalLeader();
                break;
            case MANAGER: worker = new Manager();
                break;
        }
    }

    @When("project delivered earlier")
    public void deliveredEarlier() {
        worker.setBonus(true);
    }

    @Then("salary should be $salary")
    public void theSalaryShouldBe(double salary) {
        Calculator calculator = new CalculatorImpl(worker);
        assertEquals(salary, calculator.calculateSalary(40), 0.1);
    }
}
