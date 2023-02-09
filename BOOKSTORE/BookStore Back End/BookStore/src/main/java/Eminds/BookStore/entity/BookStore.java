package Eminds.BookStore.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Book_Store")
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "bookName", unique=true)
    private String bookName;

    private String authorName;

    private String publisherName;

    private int quantity;

    private BigDecimal price;

    public BookStore() {
    }

    public BookStore(String bookName, String authorName, String publisherName, int quantity, BigDecimal price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.quantity = quantity;
        this.price = price;
    }

    public BookStore(Long bookId, String bookName, String authorName, String publisherName, int quantity, BigDecimal price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
