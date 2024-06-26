-- 코드를 입력하세요
SELECT P.MEMBER_NAME, R.REVIEW_TEXT, TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD') REVIEW_DATE
FROM MEMBER_PROFILE P, REST_REVIEW R
WHERE P.MEMBER_ID = R.MEMBER_ID
AND P.MEMBER_ID IN ((SELECT MEMBER_ID
                    FROM REST_REVIEW
                    GROUP BY MEMBER_ID
                    HAVING COUNT(1) = (SELECT MAX(COUNT(MEMBER_ID))
                                        FROM REST_REVIEW
                                        GROUP BY MEMBER_ID)))
ORDER BY R.REVIEW_DATE, R.REVIEW_TEXT;



