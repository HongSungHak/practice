-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.ANIMAL_TYPE, o.Name FROM ANIMAL_OUTS AS o LEFT JOIN ANIMAL_INS AS i
ON  i.ANIMAL_ID = o.ANIMAL_ID
WHERE i.SEX_UPON_INTAKE LIKE 'Intact%'
AND (o.SEX_UPON_OUTCOME LIKE 'Spayed%'
OR o.SEX_UPON_OUTCOME LIKE 'Neutered%')
ORDER BY o.ANIMAL_ID