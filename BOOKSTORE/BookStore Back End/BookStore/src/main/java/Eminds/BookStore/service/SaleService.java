package Eminds.BookStore.service;


import Eminds.BookStore.entity.Sales;

import java.util.List;
public interface SaleService {
    Sales save(Sales sales);

    List<Sales> getSales();
}
