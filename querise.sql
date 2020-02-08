-- выводим всю таблицу

SELECT * FROM jaegers1;

-- у меня все уничтожены, поэтому выведу всех Российских

SELECT * FROM jaegers1 WHERE origin = 'Russia';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6

SELECT * FROM jaegers1 WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- отсортируйте таблицу по убыванию по столбцу mark

SELECT * FROM jaegers1 Order By mark DESC;

-- отобразите самого старого робота

SELECT * FROM jaegers1 WHERE launch = (SELECT MIN(launch) FROM jaegers1);

-- отобразите роботов, которые уничтожили больше/меньше всех kaiju

SELECT * FROM jaegers1 WHERE kaijukill > (SELECT AVG(kaijukill) FROM jaegers1)Order By kaijukill DESC;
SELECT * FROM jaegers1 WHERE kaijukill < (SELECT AVG(kaijukill) FROM jaegers1)Order By kaijukill;

-- отобразите средний вес роботов

SELECT AVG(weight) FROM jaegers1;

-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
-- я увеличил у японских роботов

UPDATE jaegers1 SET kaijukill = kaijukill + 1 WHERE origin = 'Japan';

-- удалите уничтоженных роботов (удалил американских)

DELETE FROM jaegers1 WHERE origin = 'USA';
