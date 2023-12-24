SELECT  TO_CHAR(START_DATE, 'mm')*1 MONTH, CAR_ID,  COUNT(*) RECORDS
FROM    CAR_RENTAL_COMPANY_RENTAL_HISTORY A
WHERE   1=1
        AND TO_CHAR(START_DATE,'YYYYMM') BETWEEN '202208' AND '202210'
        AND CAR_ID IN   (
                        SELECT  CAR_ID
                        FROM    CAR_RENTAL_COMPANY_RENTAL_HISTORY A
                        WHERE   1=1
                                AND TO_CHAR(START_DATE,'YYYYMM') BETWEEN '202208' AND '202210'
                        GROUP BY CAR_ID
                        HAVING   COUNT(*) > 4
                        )
GROUP BY    TO_CHAR(START_DATE, 'mm'), CAR_ID
HAVING      COUNT(*) <> 0
ORDER BY    1 ASC, 2 DESC