package Eminds.BookStore.serviceImpl;

import Eminds.BookStore.entity.BookStore;
import Eminds.BookStore.service.BookStoreService;
import Eminds.BookStore.repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookStoreServiceImpl implements BookStoreService {


      @Autowired
    private BookStoreRepository bookStoreRepository;

    @Override
    public BookStore save(BookStore bookStore) {
	try
	{
        	return bookStoreRepository.save(bookStore);
	}
	catch(Exception e)
	{
	}
	finally
	{
		return(bookStore);
	}
    }
    @Override
    public List<BookStore> getBookStore() {
        return bookStoreRepository.findAll();
    }
    @Override
    public void deleteBookStoreById(long bookId) {
        bookStoreRepository.deleteById(bookId);
    }

    @Override
    public BookStore getBookStoreByID(Long id) {
        Optional<BookStore> bs = bookStoreRepository.findById(id);
        return bs.get();
    }



}
