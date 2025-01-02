
select x.person_name
from (select * ,
(sum(weight) over( order by turn )) as Total_Weight
from Queue) x
where x.Total_Weight<=1000 order by x.Total_Weight desc limit 1


