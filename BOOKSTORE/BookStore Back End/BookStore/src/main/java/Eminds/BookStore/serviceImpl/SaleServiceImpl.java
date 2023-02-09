package Eminds.BookStore.serviceImpl;

import Eminds.BookStore.entity.BookStore;
import Eminds.BookStore.entity.Sales;
import Eminds.BookStore.repository.BookStoreRepository;
import Eminds.BookStore.repository.SaleRepository;
import Eminds.BookStore.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private BookStoreRepository bookStoreRepository;
    @Override
    public Sales save(Sales sales)
    {

        Optional<BookStore> B = bookStoreRepository.findById(sales.getBookId());
        try
        {
            if(B.get().getQuantity() >= sales.getSaleQty() )
            {
                B.get().setQuantity(B.get().getQuantity() - sales.getSaleQty());
                return saleRepository.save(sales);
            }
        }
        catch(Exception e)
        {

        }
        finally
        {
            return sales;
        }

    }
    @Override
    public List<Sales> getSales() {
        return saleRepository.findAll();
    }
}
