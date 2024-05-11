-- 12-4 payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

SELECT customer_id
FROM payment
ORDER BY customer_id = (SELECT COUNT(*) FROM payment );


