/* Write your T-SQL query statement below */
SELECT name AS Customers
FROM CUSTOMERS LEFT JOIN ORDERS 
ON CUSTOMERS.ID = ORDERS.CUSTOMERID
WHERE ORDERS.CUSTOMERID IS NULL;
