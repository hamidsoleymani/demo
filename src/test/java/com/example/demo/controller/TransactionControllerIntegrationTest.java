package com.example.demo.controller;

import com.example.demo.model.Transaction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.math.BigDecimal;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
//@WebMvcTest(TransactionController.class)
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {
    @Autowired
    private TransactionController transactionController;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TransactionComponentTest() throws Exception {
        mockMvc.perform(get("/transactions/123"))
                .andExpect(status().isOk())
                .andExpect( jsonPath("$[0].type", is("type1")))
                .andExpect( jsonPath("$[0].accountNumber", is("123")))
                .andExpect( jsonPath("$[0].currency", is("EURO")))
                .andExpect( jsonPath("$[0].amount", is(100)))
                .andExpect( jsonPath("$[0].merchantName", is("Apple")))
                .andExpect( jsonPath("$[0].merchantLogo", is("Apple_Logo")))

                .andExpect( jsonPath("$[1].type", is("type2")))
                .andExpect( jsonPath("$[1].accountNumber", is("123")))
                .andExpect( jsonPath("$[1].currency", is("EURO")))
                .andExpect( jsonPath("$[1].amount", is(200)))
                .andExpect( jsonPath("$[1].merchantName", is("SAP")))
                .andExpect( jsonPath("$[1].merchantLogo", is("SAP_Logo")));
    }
}
