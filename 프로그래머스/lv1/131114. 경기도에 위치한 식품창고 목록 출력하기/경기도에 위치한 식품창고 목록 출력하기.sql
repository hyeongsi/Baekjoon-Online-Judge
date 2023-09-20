-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address,NVL(freezer_yn,'N') as freezer_yn
FROM food_warehouse
WHERE substr(warehouse_name, 4,2) = '경기'
ORDER BY warehouse_id;