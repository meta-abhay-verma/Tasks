UPDATE book_issue 
SET due_dt = SUBDATE(due_dt, INTERVAL -90 DAYS)  -- SHOULD BE DAY


CREATE VIEW book_details
AS
SELECT b.accsession_no, s.subject_nm, t.title_nm, p.publisher_nm, DATE(b.purchase_dt) AS 'Purchase Date', b.price
FROM books b
JOIN titles t ON b.title_id = t.title_id
JOIN subjects s ON t.subject_id = s.subject_id
JOIN publishers p ON p.publisher_id = t.publisher_id


DROP TABLE members;


DELETE FROM publishers
WHERE publisher_nm IN ('BPB', 'Galgotia');


SELECT DISTINCT member_id, member_nm
FROM members m
JOIN book_issue b ON m.member_id = b.member_id;


SELECT DATE(purchase_dt), MAX(price), MIN(price)
FROM books
GROUP BY DATE(purchase_dt);