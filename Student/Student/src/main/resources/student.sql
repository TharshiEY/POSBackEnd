DROP TABLE IF EXISTS student;
CREATE TABLE student(id INT PRIMARY KEY, firstName VARCHAR(255), lastName VARCHAR(255), age INT);
INSERT INTO student VALUES(1, 'Hello', 'Hello', 25);
INSERT INTO student VALUES(2, 'World', 'Hello', 23);
SELECT * FROM student ORDER BY ID;
--UPDATE student SET lastName ='Hi' WHERE ID=1;
--DELETE FROM student WHERE ID=2;