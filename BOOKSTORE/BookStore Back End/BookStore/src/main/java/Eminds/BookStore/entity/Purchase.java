package Eminds.BookStore.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;

    private Long bookId;

    private int purchaseQty;

    private Date purchaseDate;

    public Purchase(Long bookId, int purchaseQty, Date purchaseDate, Long rolesId, BigDecimal totalCost) {
        this.bookId = bookId;
        this.purchaseQty = purchaseQty;
        this.purchaseDate = purchaseDate;
        this.rolesId = rolesId;
        this.totalCost = totalCost;
    }

    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }

    private Long rolesId;

    public Purchase(Long purchaseId, Long bookId, int purchaseQty, Date purchaseDate, Long rolesId, BigDecimal totalCost) {
        this.purchaseId = purchaseId;
        this.bookId = bookId;
        this.purchaseQty = purchaseQty;
        this.purchaseDate = purchaseDate;
        this.rolesId = rolesId;
        this.totalCost = totalCost;
    }

    private BigDecimal totalCost;

    public Long getRolesId() {
        return rolesId;
    }

    public Purchase() {
    }


    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getPurchaseQty() {
        return purchaseQty;
    }

    public void setPurchaseQty(int purchaseQty) {
        this.purchaseQty = purchaseQty;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

}

