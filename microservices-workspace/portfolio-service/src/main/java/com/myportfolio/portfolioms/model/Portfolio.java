package com.myportfolio.portfolioms.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Portfolio {
    @Id
    private String id;

    private String name;

    @ElementCollection
    private List<Integer> stocks = new ArrayList<>();

    @Transient
    private double totalValue;

}
