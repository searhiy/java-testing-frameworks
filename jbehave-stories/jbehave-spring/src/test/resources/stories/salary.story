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

Scenario:  calculation salary for junior engineer

Given as a junior
Then salary should be 120

Scenario:  calculation salary for junior engineer

Given as a junior
When project delivered earlier
Then salary should be 320


Scenario:  calculation salary for intermediate engineer

Given as a intermediate with hour rate 2
Then salary should be 80

Scenario:  calculation salary for intermediate engineer

Given as a intermediate with hour rate 2
When project delivered earlier
Then salary should be 280

Scenario:  calculation salary for intermediate engineer

Given as a intermediate
Then salary should be 280

Scenario:  calculation salary for intermediate engineer

Given as a intermediate
When project delivered earlier
Then salary should be 480


Scenario:  calculation salary for senior engineer

Given as a senior with hour rate 2
Then salary should be 480

Scenario:  calculation salary for senior engineer

Given as a senior with hour rate 2
When project delivered earlier
Then salary should be 680

Scenario:  calculation salary for senior engineer

Given as a senior
Then salary should be 880

Scenario:  calculation salary for senior engineer

Given as a senior
When project delivered earlier
Then salary should be 1080


Scenario:  calculation salary for techlead engineer

Given as a techlead with hour rate 2
Then salary should be 980

Scenario:  calculation salary for techlead engineer

Given as a techlead with hour rate 2
When project delivered earlier
Then salary should be 1180

Scenario:  calculation salary for techlead engineer

Given as a techlead
Then salary should be 1700

Scenario:  calculation salary for techlead engineer

Given as a techlead
When project delivered earlier
Then salary should be 1900


Scenario:  calculation salary for manager engineer

Given as a manager with hour rate 2
Then salary should be 1280

Scenario:  calculation salary for manager engineer

Given as a manager with hour rate 2
When project delivered earlier
Then salary should be 1480

Scenario:  calculation salary for manager engineer

Given as a manager
Then salary should be 1200

Scenario:  calculation salary for manager engineer

Given as a manager
When project delivered earlier
Then salary should be 1400
