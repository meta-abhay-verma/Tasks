SELECT count(*) AS number_of_customers, country
FROM customers 
WHERE country <> 'USA'
GROUP BY country
HAVING number_of_customers >= 2
ORDER BY number_of_customers DESC;

-- number_of_customers 	country
	2									ENGLAND
	2									INDIA