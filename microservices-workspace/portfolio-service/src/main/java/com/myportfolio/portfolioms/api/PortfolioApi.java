package com.myportfolio.portfolioms.api;

import com.myportfolio.portfolioms.model.Portfolio;
import com.myportfolio.portfolioms.repository.PortfolioRepository;
import com.myportfolio.portfolioms.service.PortfolioService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
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
   @CircuitBreaker(fallbackMethod = "getPortfolioByIdFallback", name = "stocks-service-cb")
//    @Retry(fallbackMethod = "getPortfolioByIdFallback", name = "retry-stocks-fetch")
    public Portfolio getPortfolioById(@PathVariable String id){
        return portfolioService.getPortfolioById(id);
    }


    public Portfolio getPortfolioByIdFallback(@PathVariable String id, Throwable error) {
        log.error(error.toString());
        throw new ResponseStatusException(HttpStatus.BAD_GATEWAY,error.getMessage());
    }





}
