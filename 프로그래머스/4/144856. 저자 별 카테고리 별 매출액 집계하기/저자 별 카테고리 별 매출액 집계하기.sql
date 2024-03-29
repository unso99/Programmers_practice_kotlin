SELECT A.AUTHOR_ID, B.AUTHOR_NAME, A.CATEGORY, SUM(A.PRICE * C.SALES) AS TOTAL_PRICE
FROM BOOK A, AUTHOR B, BOOK_SALES C
WHERE A.AUTHOR_ID = B.AUTHOR_ID AND A.BOOK_ID = C.BOOK_ID 
    AND TO_CHAR(C.SALES_DATE,'YYYY-MM') = '2022-01'
GROUP BY A.AUTHOR_ID, B.AUTHOR_NAME, A.CATEGORY
ORDER BY A.AUTHOR_ID ASC, A.CATEGORY DESC
