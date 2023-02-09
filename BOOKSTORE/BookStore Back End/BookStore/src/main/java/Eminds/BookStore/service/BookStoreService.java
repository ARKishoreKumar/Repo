package Eminds.BookStore.service;

import Eminds.BookStore.entity.BookStore;
import Eminds.BookStore.repository.BookStoreRepository;

import java.util.List;

public interface BookStoreService {
    BookStore save(BookStore bookStore);
    List<BookStore> getBookStore();

    void deleteBookStoreById(long bookId);

    public BookStore getBookStoreByID(Long id);

}
