package com.example.demo.service;

import com.example.demo.service.TransactionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Test
    void findAllByAccountNumber() {

        TransactionService transactionService = new TransactionService();

        assertEquals(2, transactionService.findAllByAccountNumber("123").size());
    }
}