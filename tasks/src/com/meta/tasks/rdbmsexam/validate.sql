DELIMITER $$
CREATE FUNCTION validateName(name VARCHAR(100))
RETURNS BOOLEAN
DETERMINISTIC
BEGIN

DECLARE i INT;
DECLARE size_of_name INT;
DECLARE token CHAR;

SET i = 0;
SET size_of_name = LENGTH(name);

WHILE i < size_of_name DO	-- SYNTAX OF WHILE LOOP IS TERRIBLY WRONG
	SET i = i + 1;
	SET token = RIGHT(LEFT(name,i),1);
	IF !((token >= 'a' && token <= 'z') || (token >= 'A' && token <= 'Z')) THEN
		RETURN FALSE;
	END IF;
END WHILE;

RETURN TRUE;

END$$
DELIMITER ;

SELECT validateName('Abhay');