-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM (SELECT I.ANIMAL_ID, I.NAME
    FROM ANIMAL_INS I
    JOIN ANIMAL_OUTS O
    ON I.ANIMAL_ID = O.ANIMAL_ID
    ORDER BY O.DATETIME - I.DATETIME DESC)
WHERE ROWNUM <= 2;
