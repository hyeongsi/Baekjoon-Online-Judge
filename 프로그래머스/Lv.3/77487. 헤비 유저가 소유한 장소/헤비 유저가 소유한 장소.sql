SELECT 
    P.ID, P.NAME, P.HOST_ID
FROM (
    SELECT 
        PLACES.*, 
        ROW_NUMBER() OVER (ORDER BY ID) AS row_num
    FROM 
        PLACES
    WHERE 
        HOST_ID IN (
            SELECT 
                HOST_ID
            FROM 
                PLACES
            GROUP BY 
                HOST_ID
            HAVING 
                COUNT(*) > 1
        )
) P
ORDER BY 
    P.row_num;