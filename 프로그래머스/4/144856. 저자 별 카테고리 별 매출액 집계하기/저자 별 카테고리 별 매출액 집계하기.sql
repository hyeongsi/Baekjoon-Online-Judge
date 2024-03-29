WITH TMP AS(
SELECT      BOOK_ID
        ,   SUM(SALES) SALES
FROM        BOOK_SALES
WHERE       1=1
            AND TO_CHAR(SALES_DATE,'YYYYMM') = '202201'
GROUP BY    BOOK_ID
)

SELECT      B.AUTHOR_ID
        ,   (SELECT X.AUTHOR_NAME FROM AUTHOR X WHERE X.AUTHOR_ID = B.AUTHOR_ID) AUTHOR_NAME
        ,   B.CATEGORY
        ,   SUM(B.PRICE * SALES)    TOTAL_SALES
FROM        TMP     A
        ,   BOOK    B
WHERE       1=1
            AND A.BOOK_ID = B.BOOK_ID
GROUP BY    B.AUTHOR_ID, B.CATEGORY
ORDER BY AUTHOR_ID ASC, CATEGORY DESC