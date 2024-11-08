select r.contest_id ,
ROUND((COUNT(DISTINCT r.user_id) / (SELECT COUNT(DISTINCT u.user_id) )) * 100, 2) 
as percentage
FROM Users u
JOIN Register r group by r.contest_id 
order by 2 DESC, 1 ASC
