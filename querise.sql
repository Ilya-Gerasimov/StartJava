-- ������� ��� �������

SELECT * FROM jaegers1;

-- � ���� ��� ����������, ������� ������ ���� ����������

SELECT * FROM jaegers1 WHERE origin = 'Russia';

-- ���������� ������� ���������� �����, �������� Mark-1 � Mark-6

SELECT * FROM jaegers1 WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- ������������ ������� �� �������� �� ������� mark

SELECT * FROM jaegers1 Order By mark DESC;

-- ���������� ������ ������� ������

SELECT * FROM jaegers1 WHERE launch = (SELECT MIN(launch) FROM jaegers1);

-- ���������� �������, ������� ���������� ������/������ ���� kaiju

SELECT * FROM jaegers1 WHERE kaijukill > (SELECT AVG(kaijukill) FROM jaegers1)Order By kaijukill DESC;
SELECT * FROM jaegers1 WHERE kaijukill < (SELECT AVG(kaijukill) FROM jaegers1)Order By kaijukill;

-- ���������� ������� ��� �������

SELECT AVG(weight) FROM jaegers1;

-- ��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
-- � �������� � �������� �������

UPDATE jaegers1 SET kaijukill = kaijukill + 1 WHERE origin = 'Japan';

-- ������� ������������ ������� (������ ������������)

DELETE FROM jaegers1 WHERE origin = 'USA';
