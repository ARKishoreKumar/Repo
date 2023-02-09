package Eminds.BookStore.controller;

import Eminds.BookStore.entity.BookStore;
import Eminds.BookStore.repository.BookStoreRepository;
import Eminds.BookStore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1")
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @PostMapping("/save")
    public ResponseEntity<?> createBookStore(@RequestBody BookStore bookStore){
        bookStoreService.save(bookStore);
        return new ResponseEntity<>("Book Stored Successfully",HttpStatus.CREATED);
    }
    @GetMapping("/bookStore")
    public ResponseEntity<List<BookStore>> getBookStore()
    {
        return ResponseEntity.ok(bookStoreService.getBookStore());
    }

    @DeleteMapping("/bookStore/{bookId}")
    public ResponseEntity<?> deleteBookStoreById(@PathVariable("bookId") long bookId)
    {
        bookStoreService.deleteBookStoreById(bookId);
        return new ResponseEntity<>("Book Deleted Successfully",HttpStatus.OK);
    }

    @PutMapping("/bookStore/update/{bookId}")
    public Optional<BookStore> update(@RequestBody BookStore updateBook, @PathVariable Long bookId)
    {
        return bookStoreRepository.findById(bookId).map( bookStore -> {
            bookStore.setBookName(updateBook.getBookName());
            bookStore.setAuthorName(updateBook.getAuthorName());
            bookStore.setPublisherName(updateBook.getPublisherName());
            bookStore.setQuantity(updateBook.getQuantity());
            bookStore.setPrice(updateBook.getPrice());

            return bookStoreRepository.save(bookStore);
        });
    }
}
