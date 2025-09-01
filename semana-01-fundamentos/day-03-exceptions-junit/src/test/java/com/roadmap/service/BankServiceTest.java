package com.roadmap.service;

import com.roadmap.model.BankAccount;
import com.roadmap.exception.InvalidAmountException;
import com.roadmap.exception.InsufficientFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankServiceTest {

    private BankService bankService;
    private BankAccount account;

    @BeforeEach
    void setUp() {
        bankService = new BankService();
        account = new BankAccount(1, "Ricardo", 1500.0);
    }

    @Test 
    void testDepositValidAmount() {
        bankService.deposit(account, 1800.0);
        assertEquals(3300.0, account.getBalance());
    }

    @Test 
    void testDepositInvalidAmount() {
        assertThrows(InvalidAmountException.class, () -> {
            bankService.deposit(account, -10);
        });
    }

    @Test 
    void testWithdrawValidAmount() {
        bankService.withdraw(account, 150.0);
        assertEquals(1350.0, account.getBalance());
    }

    @Test 
    void testWithdrawInsufficientFunds() {
        assertThrows(InsufficientFundsException.class, () -> {
            bankService.withdraw(account, 3500.0);
        });
    }

    @Test 
    void testTransferSuccess() {
        BankAccount account2 = new BankAccount(2, "Alejandra", 300.0);
        bankService.transfer(account, account2, 200.0);

        assertEquals(1300.0, account.getBalance());
        assertEquals(500.0, account2.getBalance());
    }

    @Test 
    void testTransferWithInsufficientFunds() {
        BankAccount account2 = new BankAccount(2, "Alejandra", 300.0);
        assertThrows(InsufficientFundsException.class, () -> {
            bankService.transfer(account, account2, 2000.0);
        });
    }

}
