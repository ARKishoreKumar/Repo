package Eminds.BookStore.entity;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salesId;

    private Long bookId;

    private int saleQty;

    public Long getRolesId() {
        return rolesId;
    }

    private Date saleDate;

    private Long rolesId;

    public void setRolesId(Long rolesId) {
        this.rolesId = rolesId;
    }

    private BigDecimal totalCost;

    public Sales() {
    }


    public Sales(Long bookId, int saleQty, Date saleDate, Long rolesId, BigDecimal totalCost) {
        this.bookId = bookId;
        this.saleQty = saleQty;
        this.saleDate = saleDate;
        this.rolesId = rolesId;
        this.totalCost = totalCost;
    }

    public Sales(Long salesId, Long bookId, int saleQty, Date saleDate, Long rolesId, BigDecimal totalCost) {
        this.salesId = salesId;
        this.bookId = bookId;
        this.saleQty = saleQty;
        this.saleDate = saleDate;
        this.rolesId = rolesId;
        this.totalCost = totalCost;
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(int saleQty) {
        this.saleQty = saleQty;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}
