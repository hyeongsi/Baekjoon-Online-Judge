SELECT 
  B01.LEV
 ,NVL(A01.CNT, 0)
FROM (
    SELECT
      TO_CHAR(DATETIME, 'HH24')         AS HOUR
     ,COUNT(TO_CHAR(DATETIME, 'HH24'))  AS CNT
    FROM ANIMAL_OUTS 
    GROUP BY TO_CHAR(DATETIME, 'HH24')
    ) A01
    RIGHT JOIN (SELECT 
                    LEVEL -1 AS LEV
                FROM DUAL
                CONNECT BY LEVEL <= 24
               ) B01
    ON A01.HOUR = B01.LEV
    ORDER BY LEV