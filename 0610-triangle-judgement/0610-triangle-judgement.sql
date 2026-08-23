# Write your MySQL query statement below
select x  , y  , z , 
    (CASE 
        WHEN x < y+z AND y < x+z AND z < y+x THEN 'Yes' 
        ELSE 'No'
    END) as triangle
FROM Triangle 