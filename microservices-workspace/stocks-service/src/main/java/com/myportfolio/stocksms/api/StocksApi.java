package com.myportfolio.stocksms.api;

import com.myportfolio.stocksms.dto.StockInputList;
import com.myportfolio.stocksms.model.Stock;
import com.myportfolio.stocksms.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StocksApi {

    @Autowired
    private StocksRepository stocksRepo;

    @GetMapping("/{id}")
    public Stock getStockById(@PathVariable int id) {
        return stocksRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("No stock found with ID : " + id));
    }

    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stocksRepo.save(stock);
    }

//    @GetMapping
//    public List<Stock> getAllStocks(){
//        return stocksRepo.findAll();
//    }

    @PostMapping("/all")
    public List<Stock> findAllByIds(@RequestBody StockInputList stockInputs) {
        return stocksRepo.findAllById(stockInputs.ids());

    }

}
