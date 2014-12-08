package com.jbehave.stories.core.model;

/**
 * Created by serhii on 08.12.14.
 */
public class WorkerIdentifier {

    public static Worker getWorker(String worker){
        Employee employee = Employee.valueOf(worker.toUpperCase());
        switch (employee){
            case JUNIOR: return new JuniorEngineer();
            case INTERMEDIATE: return new IntermediateEngineer();
            case SENIOR: return new SeniorEngineer();
            case TECHLEAD: return new TechnicalLeader();
            case MANAGER: return new Manager();
        }
        return null;
    }

    public static Worker getWorker(String worker, double rate){
        Employee employee = Employee.valueOf(worker.toUpperCase());
        switch (employee){
            case JUNIOR: return new JuniorEngineer(rate);
            case INTERMEDIATE: return new IntermediateEngineer(rate);
            case SENIOR: return new SeniorEngineer(rate);
            case TECHLEAD: return new TechnicalLeader(rate);
            case MANAGER: return new Manager(rate);
        }
        return null;
    }
}
