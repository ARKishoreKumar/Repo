package Eminds.BookStore.service;


import Eminds.BookStore.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase save(Purchase purchase);

    List<Purchase> getPurchase();
}
