package dev.patika.libraryManagementSystem.business.abstracts;

import dev.patika.libraryManagementSystem.entity.Book;
import org.springframework.data.domain.Page;

public interface IBookService {
    Book save(Book book);
    Book get(int id);
    Page<Book> cursor(int page, int pageSize);
    Book update(Book book);
    boolean delete(int id);
}
