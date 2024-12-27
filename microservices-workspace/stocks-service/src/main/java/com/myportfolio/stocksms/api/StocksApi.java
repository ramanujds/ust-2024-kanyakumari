package com.myportfolio.stocksms.api;

import com.myportfolio.stocksms.dto.StockInputList;
import com.myportfolio.stocksms.error.ResourceNotFoundException;
import com.myportfolio.stocksms.model.Stock;
import com.myportfolio.stocksms.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stocks")
public class StocksApi {

    private final StocksRepository stocksRepo;

    public StocksApi(StocksRepository stocksRepo) {
        this.stocksRepo = stocksRepo;
    }

    @GetMapping("/{id}")
    public Stock getStockById(@PathVariable int id) {
        return stocksRepo.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("No resources found with ID : " + id));
    }


    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stocksRepo.save(stock);
    }



    @PostMapping("/all")
    public List<Stock> findAllByIds(@RequestBody StockInputList stockInputs) {
        return stocksRepo.findAllById(stockInputs.ids());

    }

}
