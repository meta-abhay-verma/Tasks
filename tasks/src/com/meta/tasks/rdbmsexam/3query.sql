SELECT CONCAT(UCASE(LEFT(name,1)),LCASE(SUBSTRING(name,2))) AS name , country
FROM customers 
WHERE 
	customerName LIKE '%E'
	OR customerName LIKE '%L'
	OR customerName LIKE '%Y'
ORDER BY country;

-- number_of_customers 	country
	Steve							Australia
	Garry							Englind
	Sunil								India