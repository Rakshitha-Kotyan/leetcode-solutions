# Write your MySQL query statement below
select (CASE
            when id%2=1 and id+1 IN (select id from Seat) then id+1
            when id%2=0 then id-1
            else id
        END) as id,student from Seat
        ORDER BY id