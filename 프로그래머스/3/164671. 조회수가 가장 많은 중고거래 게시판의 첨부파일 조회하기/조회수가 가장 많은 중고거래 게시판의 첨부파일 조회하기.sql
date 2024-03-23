-- 코드를 입력하세요
with mx as (
    select 
        max(board_id) keep(dense_rank last order by views) board_id
    from used_goods_board
)

select '/home/grep/src/'||f.board_id||'/'||f.file_id||f.file_name||f.file_ext file_path 
from used_goods_file f
where f.board_id in (
        select board_id 
        from mx
)
order by f.file_id desc