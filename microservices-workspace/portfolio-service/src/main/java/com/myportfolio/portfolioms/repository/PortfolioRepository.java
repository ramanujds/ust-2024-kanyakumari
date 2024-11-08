package com.myportfolio.portfolioms.repository;

import com.myportfolio.portfolioms.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio,String> {
}
