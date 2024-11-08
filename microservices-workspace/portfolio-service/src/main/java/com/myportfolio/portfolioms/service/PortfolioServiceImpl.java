package com.myportfolio.portfolioms.service;

import com.myportfolio.portfolioms.dto.Stock;
import com.myportfolio.portfolioms.model.Portfolio;
import com.myportfolio.portfolioms.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    // RestTemplate
    // WebClient
    // Feign Client
    // Http Client

    @Autowired
    private PortfolioRepository portfolioRepo;

    @Autowired
    private RestTemplate restTemplate;

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

    public double fetchTotalValue(Portfolio portfolio) {

        double totalValue = 0;
        for (int stockId : portfolio.getStocks()) {

            Stock stock = restTemplate.getForObject("http://STOCKS-SERVICE/stocks/" + stockId, Stock.class);
            totalValue += stock.getPrice();

        }
        return totalValue;
    }

}
