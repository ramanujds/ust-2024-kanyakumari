package com.myportfolio.portfolioms.api;

import com.myportfolio.portfolioms.model.Portfolio;
import com.myportfolio.portfolioms.repository.PortfolioRepository;
import com.myportfolio.portfolioms.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portfolio")
public class PortfolioApi {

    @Autowired
    private PortfolioService portfolioService;

    @PostMapping
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio){
        return portfolioService.createPortfolio(portfolio);
    }
    @GetMapping("/{id}")
    public Portfolio getPortfolioById(@PathVariable String id){
        return portfolioService.getPortfolioById(id);
    }


}
