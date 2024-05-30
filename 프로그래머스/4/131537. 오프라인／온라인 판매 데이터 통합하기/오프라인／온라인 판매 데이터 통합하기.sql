WITH TMP AS(
SELECT      *
FROM        ONLINE_SALE
WHERE       1=1
            AND TO_CHAR(SALES_DATE,'YYYYMM') = '202203'

UNION ALL


SELECT      OFFLINE_SALE_ID
        ,   NULL                     
        ,   PRODUCT_ID
        ,   SALES_AMOUNT
        ,   SALES_DATE
FROM        OFFLINE_SALE
WHERE       1=1
            AND TO_CHAR(SALES_DATE,'YYYYMM') = '202203'
)

SELECT      TO_CHAR(SALES_DATE,'YYYY-MM-DD') SALES_DATE
        ,   PRODUCT_ID
        ,   USER_ID
        ,   SALES_AMOUNT
FROM        TMP
ORDER BY    1 ASC, 2 ASC, 3 ASC