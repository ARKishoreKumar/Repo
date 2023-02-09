package Eminds.BookStore.controller;


import Eminds.BookStore.entity.Sales;
import Eminds.BookStore.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v3")

public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping("/sales/Save")
    public ResponseEntity<?> createSales(@RequestBody Sales sales) {
        saleService.save(sales);
        return new ResponseEntity<>("Book Sold Successfully", HttpStatus.CREATED);
    }
    @GetMapping("/sales")
    public ResponseEntity<List<Sales>> getSales(){
        return ResponseEntity.ok(saleService.getSales());
    }
}
