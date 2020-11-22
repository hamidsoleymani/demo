package com.example.demo.controller;

import com.example.demo.model.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(TransactionController.class)
public class TransactionControllerIntegrationTest {
    @Autowired
    private TransactionController transactionController;
   // @Autowired
    //private MockMvc mockMvc;

    @Test
    public void TransactionComponentTest() {
        List<Transaction> allByAccountNumber = transactionController.findAllByAccountNumber("123");
    }
}
