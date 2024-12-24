
select
e.employee_id employee_id,
e.name,
count(e.employee_id) reports_count,
round(avg(emp2.age)) average_age
from Employees e
join Employees emp2
on e.employee_id = emp2.reports_to
group by 1,2
order by employee_id
