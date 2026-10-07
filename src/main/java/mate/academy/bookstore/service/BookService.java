package mate.academy.bookstore.service;

import mate.academy.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> getAll();
}
