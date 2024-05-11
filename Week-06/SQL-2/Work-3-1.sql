-- film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.

SELECT rental_rate, COUNT(*) FROM film
GROUP BY rental_rate;