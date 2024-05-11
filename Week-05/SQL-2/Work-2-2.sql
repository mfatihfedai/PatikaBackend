-- 2.2 film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?

SELECT COUNT(*) FROM film
WHERE title LIKE 'C%';