SELECT u.name, u.email, o.orderId, o.orderDate, o.amount
FROM users u
LEFT JOIN orders o ON u.userId = o.userId