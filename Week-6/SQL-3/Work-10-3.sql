-- 10-3 customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

SELECT first_name, last_name, rental.rental_id FROM customer 
FULL JOIN rental ON customer.customer_id = rental.customer_id;
