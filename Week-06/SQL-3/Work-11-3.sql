-- 11-3 actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.

SELECT first_name FROM actor EXCEPT SELECT first_name FROM customer;