Story: Salary calculator

Meta:
@scope interview
@author Serhii K.

Narrative:
    As a salary deperment manager
    I want to calculate salaries for all worker in company by their rates
    So that I can see the results in console

Scenario:  calculation salary for junior engineer

Given as a junior with hour rate 2
Then salary should be 80

Scenario:  calculation salary for junior engineer

Given as a junior with hour rate 2
When project delivered earlier
Then salary should be 280
