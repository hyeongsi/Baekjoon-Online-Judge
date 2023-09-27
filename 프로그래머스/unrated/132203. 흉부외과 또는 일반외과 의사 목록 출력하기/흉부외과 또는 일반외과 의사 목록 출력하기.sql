-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, TO_CHAR(hire_ymd, 'YYYY-MM-DD') as hire_ymd
FROM doctor
WHERE mcdp_cd IN ('CS', 'GS') 
ORDER BY hire_ymd desc, dr_name asc;