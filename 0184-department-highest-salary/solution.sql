SELECT Department.name AS Department,Employee.name AS Employee,Employee.salary AS Salary 
FROM Department JOIN Employee ON Employee.departmentId = Department.id 
WHERE (departmentId,salary) IN (SELECT departmentId,max(salary) FROM Employee GROUP BY departmentId)
