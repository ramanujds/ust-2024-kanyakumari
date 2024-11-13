package com.myportfolio.portfolioms.feignclient;

import com.myportfolio.portfolioms.dto.Stock;
import com.myportfolio.portfolioms.dto.StockInputList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "STOCKS-SERVICE")
public interface StocksServiceClient {

    @PostMapping("/stocks/all")
    public List<Stock> getAllStocks(@RequestBody StockInputList stockInputs);



}
