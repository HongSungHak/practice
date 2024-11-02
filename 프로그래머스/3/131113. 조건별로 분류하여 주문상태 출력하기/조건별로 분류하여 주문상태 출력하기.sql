-- 코드를 입력하세요
SELECT ORDER_ID, PRODUCT_ID, DATE_FORMAT(OUT_DATE, '%Y-%m-%d') AS OUT_DATE,
case 
    when out_date <= '2022-05-01' then '출고완료'
    when out_date is null then '출고미정'
    else '출고대기'
end as '출고여부'
from food_order
order by order_id asc