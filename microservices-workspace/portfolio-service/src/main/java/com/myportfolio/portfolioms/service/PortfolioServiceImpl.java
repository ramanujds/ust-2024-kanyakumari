package com.myportfolio.portfolioms.service;

import com.myportfolio.portfolioms.dto.Stock;
import com.myportfolio.portfolioms.dto.StockInputList;
import com.myportfolio.portfolioms.feignclient.StocksServiceClient;
import com.myportfolio.portfolioms.model.Portfolio;
import com.myportfolio.portfolioms.repository.PortfolioRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@Service
public class PortfolioServiceImpl implements PortfolioService {

    // RestTemplate
    // WebClient
    // Feign Client
    // Http Client

    @Autowired
    private PortfolioRepository portfolioRepo;


    @Autowired
    StocksServiceClient stocksServiceClient;


    public Portfolio createPortfolio(Portfolio portfolio) {
        Portfolio savedPortfolio = portfolioRepo.save(portfolio);
        savedPortfolio.setTotalValue(fetchTotalValue(savedPortfolio));
        return savedPortfolio;
    }

    public Portfolio getPortfolioById(String id) {

        Portfolio portfolio = portfolioRepo.findById(id).orElseThrow(() -> new RuntimeException("No Portfolio Found with ID " + id));

        portfolio.setTotalValue(fetchTotalValue(portfolio));
        return portfolio;
    }

    @CircuitBreaker(fallbackMethod = "getAllStocksFallback", name = "stocks-service-cb")
    public List<Stock> getAllStocks(List<Integer> stockIds) {
        var stockIdsList = new StockInputList(stockIds);
        return stocksServiceClient.getAllStocks(stockIdsList);
    }

    private double fetchTotalValue(Portfolio portfolio) {
        return getAllStocks(portfolio.getStocks()).stream().mapToDouble(Stock::getPrice).sum();
    }


    public List<Stock> getAllStocksFallback(List<Integer> stockIds, Throwable error) {
        throw new ResponseStatusException(HttpStatus.BAD_GATEWAY,error.getMessage());
    }




}
