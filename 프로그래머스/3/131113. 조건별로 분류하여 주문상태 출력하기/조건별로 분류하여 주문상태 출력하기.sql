-- 코드를 입력하세요
SELECT ORDER_ID, 
        PRODUCT_ID, 
        TO_CHAR(OUT_DATE, 'YYYY-MM-DD') OUT_DATE, 
        DECODE(TO_CHAR(OUT_DATE, 'YYYYMMDD'), '', '출고미정', 
        CASE 
            WHEN TO_CHAR(OUT_DATE, 'YYYYMMDD') <= '20220501' THEN '출고완료' 
            WHEN TO_CHAR(OUT_DATE, 'YYYYMMDD') > '20220501' THEN '출고대기'
        END
               ) 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID;
