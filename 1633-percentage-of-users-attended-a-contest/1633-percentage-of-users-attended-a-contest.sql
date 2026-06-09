# Write your MySQL query statement below
select contest_id,
Round(Count(u.user_id)*100 / (Select Count(*) From users),2) As percentage
From users u
Join register r
On u.user_id=r.user_id
Group By r.contest_id
Order By percentage DESC, r.contest_id ASC