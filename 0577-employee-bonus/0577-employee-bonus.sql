# Write your MySQL query statement below
SELECT name, bonus
FROM EMPLOYEE LEFT JOIN BONUS
ON EMPLOYEE.empId = BONUS.empID
WHERE bonus < 1000 OR bonus IS NULL;