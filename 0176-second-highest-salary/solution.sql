SELECT MAX(salary) as SecondHighestSalary FROM Employee
WHERE SALARY < (SELECT MAX(salary) FROM Employee)
