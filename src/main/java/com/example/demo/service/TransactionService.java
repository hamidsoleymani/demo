package com.example.demo.service;


import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.model.*;

@Service
public class TransactionService {
    private static Map<String, List<Transaction>> transactions;

    static {
        transactions = new HashMap<>();
        transactions.put("123",
                Arrays.asList(
                        new Transaction("type1", "123", "EURO", new BigDecimal(100),
                                "Apple", "Apple_Logo"),
                        new Transaction("type2", "123", "EURO", new BigDecimal(200),
                                "SAP", "SAP_Logo")));
    }

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return transactions.get(accountNumber);
    }
}
