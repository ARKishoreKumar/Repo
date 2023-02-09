package Eminds.BookStore.serviceImpl;


import Eminds.BookStore.entity.BookStore;
import Eminds.BookStore.entity.Purchase;
import Eminds.BookStore.repository.BookStoreRepository;
import Eminds.BookStore.repository.PurchaseRepository;
import Eminds.BookStore.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;
    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Override
    public Purchase save(Purchase purchase) {
        Optional<BookStore> b = bookStoreRepository.findById(purchase.getBookId());
        try
        {
            b.get().setQuantity(b.get().getQuantity() + purchase.getPurchaseQty());
            return purchaseRepository.save(purchase);
        }
        catch(Exception e) {
            return purchase;
        }
    }
    @Override
    public List<Purchase> getPurchase() {
        return purchaseRepository.findAll();
    }

}
