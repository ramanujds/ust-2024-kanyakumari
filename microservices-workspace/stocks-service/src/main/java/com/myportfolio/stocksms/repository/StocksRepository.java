package com.myportfolio.stocksms.repository;

import com.myportfolio.stocksms.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stock,Integer> {
}
