select e.name , b.bonus from Employee e
left Join Bonus  b on e.empId=b.empId 
where b.bonus < 1000 or b.bonus is null ;
