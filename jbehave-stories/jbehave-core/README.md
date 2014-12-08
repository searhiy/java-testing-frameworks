# Exercise for IT Academy interview

## Salary Calculator

The salary calculator is the imitation of simple automation tool for salary department in IT company. As in any
IT company, this company has following employees: junior, intermediate, senior engineers, technical leader and manager.

Each of them have default rates per hour (see below).

### Default rates:

 - junior           - 3$
 - intermediate     - 7$
 - senior           - 12$
 - technical leader - 20$
 - manager          - 1$

In addition company has pays a bonus (200$) if team delivered application earlier defined release date. Also exists
different incomes for different activities (see below)

### Addition incomes:

 - meetings            - 200$
 - teaching activities - 300$
 - lead activities     - 400$
 - success             - 600$

### For each employee we have following algorithms:

 - junior:           rate * reported hours
 - intermediate:     rate * reported hours
 - senior:           (rate * reported hours) + lead activities income
 - technical leader: (rate * reported hours) + lead activities income + teaching activities income + meeting income
 - manager:          (rate * reported hours) + lead activities income + meetings income + success income

Also salary department want to have probability to change default rate and calculate salary in case delivered earlier
application.

You have already written test and stubbed implementation of Calculator interface. You need to implement this calculator
for passing all tests (story).