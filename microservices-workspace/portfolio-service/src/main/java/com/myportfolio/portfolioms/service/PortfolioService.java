package com.myportfolio.portfolioms.service;

import com.myportfolio.portfolioms.model.Portfolio;

public interface PortfolioService {

    public Portfolio createPortfolio(Portfolio portfolio);

    public Portfolio getPortfolioById(String id);

}
