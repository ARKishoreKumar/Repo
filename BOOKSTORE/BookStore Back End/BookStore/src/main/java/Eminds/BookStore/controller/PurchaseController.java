package Eminds.BookStore.controller;


import Eminds.BookStore.entity.Purchase;
import Eminds.BookStore.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v2")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/purchase/save")
    public ResponseEntity<?> createPurchase(@RequestBody Purchase purchase) {
        purchaseService.save(purchase);
        return new ResponseEntity<>("Book Purchased Successfully",HttpStatus.CREATED);
    }
    @GetMapping("/purchase")
    public ResponseEntity<List<Purchase>> getPurchase(){
        return ResponseEntity.ok(purchaseService.getPurchase());
    }
}
